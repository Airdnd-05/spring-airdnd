package com.spring.airdnd.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "locations")
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private Long locationId;

    @Column(name = "location_country", nullable = false, length = 50)
    private String locationCountry;

    @Column(name = "location_city", nullable = false, length = 50)
    private String locationCity;

    @Column(name = "location_local", nullable = false, length = 50)
    private String locationLocal;

//    @Builder
//    private Location(String locationCountry, String locationCity, String locationLocal) {
//        this.locationCountry = locationCountry;
//        this.locationCity = locationCity;
//        this.locationLocal = locationLocal;
//    }
}
