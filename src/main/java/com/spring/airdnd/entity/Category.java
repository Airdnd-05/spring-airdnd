package com.spring.airdnd.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categories")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long categoryId;

    @Column(name = "category_name", nullable = false)
    private String categoryName;

    @Column(name = "category_svg", nullable = false)
    private String categorySvg;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private List<RoomCategory> roomCategoryList = new ArrayList<>();
}