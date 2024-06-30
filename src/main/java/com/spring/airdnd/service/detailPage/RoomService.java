package com.spring.airdnd.service.detailPage;

import com.spring.airdnd.dto.detailPage.RoomResponseDTO;
import com.spring.airdnd.entity.Room;
import com.spring.airdnd.repository.domain.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomResponseDTO getRoomDetail(Long roomId) {
        Optional<Room> room = this.roomRepository.findById(roomId);
        return RoomResponseDTO.from(room.get());
    }

    public String getRoomInfo(Long roomId){
        Room room = this.roomRepository.findByRoomId(roomId);
        return room.getRoomInfo();
    }

}
