package com.spring.airdnd.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "amenities")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Amenity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "amenity_id")
    private Long amenityId;

    @Column(name = "amenity_svg", nullable = false)
    private String amenitySvg;

    @Column(name = "amenity_name", nullable = false)
    private String amenityName;

    @OneToMany(mappedBy = "amenity", fetch = FetchType.LAZY)
    @Builder.Default
    private List<AmenityRoom> amenityRooms = new ArrayList<>();
}