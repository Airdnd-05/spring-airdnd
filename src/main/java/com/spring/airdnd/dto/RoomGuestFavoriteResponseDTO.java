package com.spring.airdnd.dto;

import com.spring.airdnd.entity.Room;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class RoomGuestFavoriteResponseDTO {
    private Float roomOverallAvg;
    private Integer roomReviewCount;

    public static RoomGuestFavoriteResponseDTO from(Room room) {
        return new RoomGuestFavoriteResponseDTO(
                room.getRoomOverallAvg(),
                room.getRoomReviewCount()
        );
    }
}
