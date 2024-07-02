package com.spring.airdnd.repository;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.spring.airdnd.dto.SearchResponseDTO;
import com.spring.airdnd.entity.QRoom;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class SearchRepositoryImpl implements SearchRepository {

    private final JPAQueryFactory queryFactory;

    @Override
    public Page<SearchResponseDTO> findRoomsByFilters(
            String roomType,
            Long minPrice,
            Long maxPrice,
            Integer bedrooms,
            Integer beds,
            Integer bathrooms,
            Boolean guestFavorite,
            String buildingType,
            List<String> amenities,
            Boolean immediateReservation,
            Boolean selfCheckIn,
            Boolean petAllowed,
            Pageable pageable
    ) {
        QRoom room = QRoom.room;
        BooleanBuilder builder = buildFilterConditions(
                roomType,
                minPrice,
                maxPrice,
                bedrooms,
                beds,
                bathrooms,
                guestFavorite,
                buildingType,
                amenities,
                immediateReservation,
                selfCheckIn,
                petAllowed
        );

        List<SearchResponseDTO> results = queryFactory
                .select(Projections.constructor(SearchResponseDTO.class,
                                                room.roomId,
                                                room.roomName,
                                                room.roomUrl1,
                                                room.roomUrl2,
                                                room.roomUrl3,
                                                room.roomUrl4,
                                                room.roomUrl5,
                                                room.roomGuestFavorite,
                                                room.roomOverallAvg,
                                                room.roomPricePerDay))
                .from(room)
                .where(builder)
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch();

        Long total = Optional.ofNullable(queryFactory
                                                 .select(room.count())
                                                 .from(room)
                                                 .where(builder)
                                                 .fetchOne()).orElse(0L);

        return new PageImpl<>(results, pageable, total);
    }

    @Override
    public long countRoomsByFilters(
            String roomType,
            Long minPrice,
            Long maxPrice,
            Integer bedrooms,
            Integer beds,
            Integer bathrooms,
            Boolean guestFavorite,
            String buildingType,
            List<String> amenities,
            Boolean immediateReservation,
            Boolean selfCheckIn,
            Boolean petAllowed
    ) {
        QRoom room = QRoom.room;
        BooleanBuilder builder = buildFilterConditions(
                roomType,
                minPrice,
                maxPrice,
                bedrooms,
                beds,
                bathrooms,
                guestFavorite,
                buildingType,
                amenities,
                immediateReservation,
                selfCheckIn,
                petAllowed
        );

        return Optional.ofNullable(queryFactory
                                           .select(room.count())
                                           .from(room)
                                           .where(builder)
                                           .fetchOne()).orElse(0L);
    }

    private BooleanBuilder buildFilterConditions(
            String roomType,
            Long minPrice,
            Long maxPrice,
            Integer bedrooms,
            Integer beds,
            Integer bathrooms,
            Boolean guestFavorite,
            String buildingType,
            List<String> amenities,
            Boolean immediateReservation,
            Boolean selfCheckIn,
            Boolean petAllowed
    ) {
        QRoom room = QRoom.room;
        BooleanBuilder builder = new BooleanBuilder();

        if (roomType != null && !roomType.equals("모든 유형")) {
            builder.and(room.roomRentType.eq(roomType));
        }

        if (minPrice != null && maxPrice != null) {
            builder.and(room.roomPricePerDay.between(minPrice, maxPrice));
        }

        if (bedrooms != null && bedrooms != 0) {
            builder.and(room.roomBedroomCount.eq(bedrooms));
        }

        if (beds != null && beds != 0) {
            builder.and(room.roomBedCount.eq(beds));
        }

        if (bathrooms != null && bathrooms != 0) {
            builder.and(room.roomBathroomCount.eq(bathrooms));
        }

        if (guestFavorite != null) {
            builder.and(room.roomGuestFavorite.eq(guestFavorite));
        }

        if (buildingType != null && !buildingType.isEmpty()) {
            builder.and(room.buildingType.buildingType.eq(buildingType));
        }

        if (immediateReservation != null) {
            builder.and(room.roomImmediateReservation.eq(immediateReservation));
        }

        if (selfCheckIn != null) {
            builder.and(room.roomSelfCheckIn.eq(selfCheckIn));
        }

        if (petAllowed != null) {
            builder.and(room.roomIsPet.eq(petAllowed));
        }

        if (amenities != null && !amenities.isEmpty()) {
            for (String amenity : amenities) {
                builder.and(room.amenityRoomList.any().amenity.amenityName.eq(amenity));
            }
        }

        return builder;
    }
}
