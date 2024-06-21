package com.spring.airdnd.repository;

import com.spring.airdnd.entity.Wishlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface WishlistRepository extends JpaRepository<Wishlist, Long> {
    @Query("SELECT w FROM Wishlist w JOIN FETCH w.room r JOIN FETCH w.user u WHERE w.wishId = :id")
    Wishlist findWishlistWithDetailsById(@Param("id") Long id);
}