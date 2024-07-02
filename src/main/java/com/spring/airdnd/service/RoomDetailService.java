package com.spring.airdnd.service;

import com.spring.airdnd.dto.RoomDescriptionResponseDTO;
import com.spring.airdnd.dto.RoomGuestFavoriteResponseDTO;
import com.spring.airdnd.dto.RoomPriceResponseDTO;
import com.spring.airdnd.entity.Room;
import com.spring.airdnd.repository.RoomDetailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoomDetailService {
    private final RoomDetailRepository roomDetailRepository;

    public RoomDescriptionResponseDTO getRoomDescription(Long id) {
        Room room = this.roomDetailRepository.findByRoomId(id)
                                             .orElseThrow(() -> new IllegalArgumentException("일치하는 숙소가 없습니다 : " + id));
        return RoomDescriptionResponseDTO.from(room);
    }

    public RoomGuestFavoriteResponseDTO getRoomGuestFavorite(Long id) {
        Room room = this.roomDetailRepository.findByRoomId(id)
                                             .orElseThrow(() -> new IllegalArgumentException("일치하는 숙소가 없습니다 : " + id));
        return RoomGuestFavoriteResponseDTO.from(room);
    }

    public RoomPriceResponseDTO getPricePerDay(Long id) {
        Room room = this.roomDetailRepository.findByRoomId(id)
                                             .orElseThrow(() -> new IllegalArgumentException("일치하는 숙소가 없습니다 : " + id));
        return RoomPriceResponseDTO.from(room);
    }
}
