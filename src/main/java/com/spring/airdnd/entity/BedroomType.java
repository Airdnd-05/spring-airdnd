package com.spring.airdnd.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "bedroom_types")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BedroomType extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bedroom_id")
    private Long bedroomId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rooms_id", nullable = false)
    private Room room;

    @Column(name = "type_bedroom_name", nullable = false)
    private String typeBedroomName;

    @Column(name = "type_bed", nullable = false)
    private String typeBed;

    @Column(name = "type_bed_icon", nullable = false)
    private String typeBedIcon;
}