package com.spring.airdnd.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "amenities")
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class Amenity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "amenity_id")
    private Long amenityId;

    @OneToMany(mappedBy = "amenity", fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<AmenityRoom> amenityRoomList = new ArrayList<>();

    @Column(name = "amenity_svg", nullable = false)
    private String amenitySvg;

    @Column(name = "amenity_group", nullable = false, length = 30)
    private String amenityGroup;

    @Column(name = "amenity_name", nullable = false, length = 50)
    private String amenityName;
}
