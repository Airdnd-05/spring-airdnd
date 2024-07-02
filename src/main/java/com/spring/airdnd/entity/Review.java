package com.spring.airdnd.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "reviews")
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private Long reviewId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    @ToString.Exclude
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id", nullable = false)
    @ToString.Exclude
    private Room room;

    @Column(name = "review_cleanliness_rating", nullable = false)
    private Float reviewCleanlinessRating;

    @Column(name = "review_accuracy_rating", nullable = false)
    private Float reviewAccuracyRating;

    @Column(name = "review_check_in_rating", nullable = false)
    private Float reviewCheckInRating;

    @Column(name = "review_communication_rating", nullable = false)
    private Float reviewCommunicationRating;

    @Column(name = "review_location_rating", nullable = false)
    private Float reviewLocationRating;

    @Column(name = "review_value_rating", nullable = false)
    private Float reviewValueRating;

    @Column(name = "review_content", nullable = false, length = 500)
    private String reviewContent;

    @Column(name = "review_avg", nullable = false)
    private Float reviewAvg;

    @Column(name = "review_date", nullable = false)
    private LocalDateTime reviewDate;
}
