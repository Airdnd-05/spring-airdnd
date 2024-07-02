package com.spring.airdnd.dto;

import lombok.*;

@Getter
@AllArgsConstructor
public class SearchResponseDTO {
    private Long roomId;
    private String roomName;
    private String roomUrl1;
    private String roomUrl2;
    private String roomUrl3;
    private String roomUrl4;
    private String roomUrl5;
    private Boolean roomGuestFavorite;
    private Float roomOverallAvg;
    private Long roomPricePerDay;
}
