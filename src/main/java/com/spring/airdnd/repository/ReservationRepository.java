package com.spring.airdnd.repository;

import com.spring.airdnd.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    @Query("SELECT res FROM Reservation res JOIN FETCH res.room r JOIN FETCH res.user u WHERE res.reservationId = :id")
    Reservation findReservationWithDetailsById(@Param("id") Long id);
}