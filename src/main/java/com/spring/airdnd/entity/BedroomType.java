package com.spring.airdnd.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "bedroom_types")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BedroomType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bedroom_id")
    private Long bedroomId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;

    @Column(name = "type_bedroom_name", nullable = false)
    private String typeBedroomName;

    @Column(name = "type_bed_and_icon", nullable = false, columnDefinition = "json")
    private String typeBed;

}