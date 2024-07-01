package com.spring.airdnd.dto.mainPage;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SearchRequestDTO {
    private String roomType = "모든 유형";
    private Long minPrice = 14000L;
    private Long maxPrice = 1700000L;
    private Integer bedrooms;
    private Integer beds;
    private Integer bathrooms;
    private Boolean guestFavorite;
    private String buildingType;
    private List<String> amenities;
    private Boolean immediateReservation;
    private Boolean selfCheckIn;
    private Boolean petAllowed;
}
