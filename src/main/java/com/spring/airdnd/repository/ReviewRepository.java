package com.spring.airdnd.repository;

import com.spring.airdnd.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    @Query("SELECT rev FROM Review rev JOIN FETCH rev.user u JOIN FETCH rev.room r WHERE rev.reviewId = :id")
    Review findReviewWithDetailsById(@Param("id") Long id);
}