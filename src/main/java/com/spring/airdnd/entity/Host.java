package com.spring.airdnd.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "hosts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Host extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "host_id")
    private Long hostId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "host_experience", nullable = false)
    private int hostExperience;

    @Column(name = "host_review_count")
    private int hostReviewCount;

    @Column(name = "host_rate")
    private float hostRate;

    @Column(name = "host_language")
    private String hostLanguage;

    @Column(name = "host_is_super", nullable = false)
    private Boolean hostIsSuper;

    @Column(name = "host_response_rate", nullable = false)
    private int hostResponseRate;

    @Column(name = "host_response_time", nullable = false)
    private int hostResponseTime;

    @Column(name = "host_description")
    private String hostDescription;

    @Column(name = "host_location")
    private String hostLocation;

    @Column(name = "host_url")
    private String hostUrl;

    @Temporal(TemporalType.DATE)
    @Column(name = "host_starting_year", nullable = false)
    private LocalDate hostStartingYear;

    @OneToMany(mappedBy = "host", fetch = FetchType.LAZY)
    @Builder.Default
    private List<Room> rooms = new ArrayList<>();
}