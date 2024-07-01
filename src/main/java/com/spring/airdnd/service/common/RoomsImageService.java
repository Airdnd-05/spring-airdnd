package com.spring.airdnd.service.common;

import com.spring.airdnd.dto.detailPage.RoomsImageResponseDTO;
import com.spring.airdnd.repository.domain.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RoomsImageService {
    private final RoomRepository roomRepository;

    public RoomsImageResponseDTO getRoomsImage(Long id) {
        return RoomsImageResponseDTO.from(
                this.roomRepository
                        .findById(id)
                        .orElseThrow(() -> new IllegalArgumentException("해당 ID에 해당하는 데이터가 없습니다"))
        );
    }
    public List<RoomsImageResponseDTO> getRoomsImageList() {
        return roomRepository.findAll().stream()
                .map(RoomsImageResponseDTO::from)
                .collect(Collectors.toList());
    }

}
