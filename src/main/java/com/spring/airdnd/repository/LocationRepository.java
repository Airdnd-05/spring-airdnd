package com.spring.airdnd.repository;

import com.spring.airdnd.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
    @Query("SELECT l FROM Location l JOIN FETCH l.rooms r WHERE l.locationId = :id")
    Location findLocationWithRoomsById(@Param("id") Long id);
}