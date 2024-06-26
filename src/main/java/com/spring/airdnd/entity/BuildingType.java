package com.spring.airdnd.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "building_types")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BuildingType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "building_type_id")
    private Long buildingTypeId;

    @Column(name = "building_type", nullable = false)
    private String buildingType;

}