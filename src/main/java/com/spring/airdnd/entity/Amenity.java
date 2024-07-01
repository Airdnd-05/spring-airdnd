package com.spring.airdnd.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "amenities")
@Getter
@AllArgsConstructor
@NoArgsConstructor
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

    @Column(name = "amenity_group", columnDefinition = "", nullable = false)
    private String amenityGroup;


    @Column(name = "amenity_name", nullable = false)
    private String amenityName;

}
