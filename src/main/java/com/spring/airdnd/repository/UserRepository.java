package com.spring.airdnd.repository;

import com.spring.airdnd.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u JOIN FETCH u.host h JOIN FETCH u.reviews rev JOIN FETCH u.reservations res JOIN FETCH u.wishlists w WHERE u.userId = :id")
    User findUserWithDetailsById(@Param("id") Long id);
}