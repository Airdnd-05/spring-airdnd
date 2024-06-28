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

//    public List<RoomsImageResponseDTO> getRoomsImage() {
//        return roomRepository.findAll().stream()
//                .map(RoomsImageResponseDTO::from)
//                .collect(Collectors.toList());
//    }
    public List<RoomsImageResponseDTO> getRoomsImageList() {
        return roomRepository.findAll().stream()
                .map(RoomsImageResponseDTO::from)
                .collect(Collectors.toList());
    }

}
