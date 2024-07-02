package com.spring.airdnd.dto;

import com.spring.airdnd.entity.Room;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class RoomResponseDTO {
    private String RoomName;
    private String LocationCity;
    private String BuildingType;

    public static RoomResponseDTO from(Room room) {
        return new RoomResponseDTO(
                room.getRoomName(),
                room.getLocation().getLocationCity(),
                room.getBuildingType().getBuildingType());
    }
}
