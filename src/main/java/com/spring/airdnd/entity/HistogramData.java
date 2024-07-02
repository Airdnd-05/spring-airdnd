package com.spring.airdnd.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "histogram_data")
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class HistogramData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "histogram_id")
    private Integer histogramId;

    @Column(name = "price_range", nullable = false, length = 30)
    private String priceRange;

    @Column(name = "count", nullable = false)
    private Integer count;
}
