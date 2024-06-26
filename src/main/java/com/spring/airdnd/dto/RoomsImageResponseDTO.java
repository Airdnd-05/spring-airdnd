package com.spring.airdnd.dto;

import com.spring.airdnd.entity.Room;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class RoomsImageResponseDTO {
    private Long roomId;
    private String mainImage;
    private String[] detailImage;

    public static RoomsImageResponseDTO from(Room room) {
        return new RoomsImageResponseDTO(
                room.getRoomId(),
                room.getRoomUrl1(),
                new String[]{room.getRoomUrl2(), room.getRoomUrl3(), room.getRoomUrl4(), room.getRoomUrl5()}
        );
    }
}
