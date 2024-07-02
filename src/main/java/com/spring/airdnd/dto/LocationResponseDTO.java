package com.spring.airdnd.dto;

import com.spring.airdnd.entity.Location;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class LocationResponseDTO {
    private String locationCity;

    public static LocationResponseDTO from(Location location) {
        return new LocationResponseDTO(
                location.getLocationCity());
    }
}
