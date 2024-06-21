package com.spring.airdnd.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "locations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Location extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private Long locationId;

    @Column(name = "location_name", nullable = false)
    private String locationName;

    @Column(name = "location_country", nullable = false)
    private String locationCountry;

    @Column(name = "location_city", nullable = false)
    private String locationCity;

    @Column(name = "location_local", nullable = false)
    private String locationLocal;

    @OneToMany(mappedBy = "location", fetch = FetchType.LAZY)
    @Builder.Default
    private List<Room> rooms = new ArrayList<>();
}

