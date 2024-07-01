package com.spring.airdnd.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "hosts")
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class Host {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "host_id")
    private Long hostId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    @ToString.Exclude
    private User user;

    @Column(name = "host_experience", nullable = false)
    private Integer hostExperience;

    @Column(name = "host_review_count")
    private Integer hostReviewCount;

    @Column(name = "host_rate")
    private Float hostRate;

    @Column(name = "host_language", length = 50)
    private String hostLanguage;

    @Column(name = "host_is_super", nullable = false)
    private Boolean hostIsSuper;

    @Column(name = "host_response_rate", nullable = false)
    private Integer hostResponseRate;

    @Column(name = "host_response_time", nullable = false)
    private Integer hostResponseTime;

    @Column(name = "host_description", length = 1000)
    private String hostDescription;

    @Column(name = "host_location")
    private String hostLocation;

    @Column(name = "host_url")
    private String hostUrl;

    @Column(name = "host_starting_year", nullable = false)
    private Integer hostStartingYear;

//    @Builder
//    private Host(User user, Integer hostExperience, Integer hostReviewCount, Float hostRate, String hostLanguage, Boolean hostIsSuper, Integer hostResponseRate, Integer hostResponseTime, String hostDescription, String hostLocation, String hostUrl, Integer hostStartingYear) {
//        this.user = user;
//        this.hostExperience = hostExperience;
//        this.hostReviewCount = hostReviewCount;
//        this.hostRate = hostRate;
//        this.hostLanguage = hostLanguage;
//        this.hostIsSuper = hostIsSuper;
//        this.hostResponseRate = hostResponseRate;
//        this.hostResponseTime = hostResponseTime;
//        this.hostDescription = hostDescription;
//        this.hostLocation = hostLocation;
//        this.hostUrl = hostUrl;
//        this.hostStartingYear = hostStartingYear;
//    }
}
