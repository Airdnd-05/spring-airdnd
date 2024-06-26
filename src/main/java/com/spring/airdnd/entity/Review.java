package com.spring.airdnd.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "reviews")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private Long reviewId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;

    @Column(name = "review_cleanliness_rating", nullable = false)
    private float reviewCleanlinessRating;

    @Column(name = "review_accuracy_rating", nullable = false)
    private float reviewAccuracyRating;

    @Column(name = "review_check_in_rating", nullable = false)
    private float reviewCheckInRating;

    @Column(name = "review_communication_rating", nullable = false)
    private float reviewCommunicationRating;

    @Column(name = "review_location_rating", nullable = false)
    private float reviewLocationRating;

    @Column(name = "review_value_rating", nullable = false)
    private float reviewValueRating;

    @Column(name = "review_content", nullable = false)
    private String reviewContent;

    @Column(name = "review_avg", nullable = false)
    private float reviewAvg;

    @Column(name = "review_date", nullable = false)
    private LocalDateTime reviewDate;
}