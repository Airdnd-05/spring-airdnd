package com.spring.airdnd.repository;

import com.spring.airdnd.dto.SearchResponseDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SearchRepository {
    Page<SearchResponseDTO> findRoomsByFilters(
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
    );

    long countRoomsByFilters(
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
    );
}

