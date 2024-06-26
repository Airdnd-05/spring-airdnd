package com.spring.airdnd.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "locations")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private Long locationId;

    @Column(name = "location_country", nullable = false)
    private String locationCountry;

    @Column(name = "location_city", nullable = false)
    private String locationCity;

    @Column(name = "location_local", nullable = false)
    private String locationLocal;

}

