package com.spring.airdnd.service;

import com.spring.airdnd.dto.SearchRequestDTO;
import com.spring.airdnd.dto.SearchResponseDTO;
import com.spring.airdnd.dto.PageCustom;
import com.spring.airdnd.repository.SearchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SearchService {

    private final SearchRepository roomRepository;

    public PageCustom<SearchResponseDTO> getRoomsByFilters(SearchRequestDTO filterRequest, int page, int size) {
        var pageable = PageRequest.of(page, size);
        var roomPage = roomRepository.findRoomsByFilters(
                filterRequest.getRoomType(),
                filterRequest.getMinPrice(),
                filterRequest.getMaxPrice(),
                filterRequest.getBedrooms(),
                filterRequest.getBeds(),
                filterRequest.getBathrooms(),
                filterRequest.getGuestFavorite(),
                filterRequest.getBuildingType(),
                filterRequest.getAmenities(),
                filterRequest.getImmediateReservation(),
                filterRequest.getSelfCheckIn(),
                filterRequest.getPetAllowed(),
                pageable);

        return new PageCustom<>(
                roomPage.getContent(),
                roomPage.getTotalPages(),
                roomPage.getTotalElements(),
                roomPage.getSize(),
                roomPage.getNumber(),
                roomPage.isFirst(),
                roomPage.isLast()
        );
    }

    public long countRoomsByFilters(SearchRequestDTO filterRequest) {
        return roomRepository.countRoomsByFilters(
                filterRequest.getRoomType(),
                filterRequest.getMinPrice(),
                filterRequest.getMaxPrice(),
                filterRequest.getBedrooms(),
                filterRequest.getBeds(),
                filterRequest.getBathrooms(),
                filterRequest.getGuestFavorite(),
                filterRequest.getBuildingType(),
                filterRequest.getAmenities(),
                filterRequest.getImmediateReservation(),
                filterRequest.getSelfCheckIn(),
                filterRequest.getPetAllowed());
    }
}
