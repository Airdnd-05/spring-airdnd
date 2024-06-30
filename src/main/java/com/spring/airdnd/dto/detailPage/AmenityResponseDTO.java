package com.spring.airdnd.dto.detailPage;

import com.spring.airdnd.entity.Amenity;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AmenityResponseDTO {

    private String amenitySvg;
    private String amenityName;

    public static AmenityResponseDTO from(Amenity amenities){
        return new AmenityResponseDTO(
                amenities.getAmenityName(),
                amenities.getAmenitySvg()
        );
    }

}
