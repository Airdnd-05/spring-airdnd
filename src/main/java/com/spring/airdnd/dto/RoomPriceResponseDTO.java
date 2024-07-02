package com.spring.airdnd.dto;

import com.spring.airdnd.entity.Room;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class RoomPriceResponseDTO {
    private Long roomPricePerDay;

    public static RoomPriceResponseDTO from(Room room) {
        return new RoomPriceResponseDTO(
                room.getRoomPricePerDay()
        );
    }
}
