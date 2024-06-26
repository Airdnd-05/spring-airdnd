package com.spring.airdnd.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "rooms_categories")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RoomCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_category_id")
    private Long roomCategoryId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;
}