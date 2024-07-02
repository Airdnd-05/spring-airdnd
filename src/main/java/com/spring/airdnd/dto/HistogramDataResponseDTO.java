package com.spring.airdnd.dto;

import com.spring.airdnd.entity.HistogramData;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class HistogramDataResponseDTO {
    private String priceRange;
    private Integer count;

    public static HistogramDataResponseDTO from(HistogramData histogramData) {
        return new HistogramDataResponseDTO(
                histogramData.getPriceRange(),
                histogramData.getCount()
        );
    }
}
