package com.spring.airdnd.repository;

import com.spring.airdnd.entity.Amenity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AmenityRepository extends JpaRepository<Amenity, Long> {
    @Query("SELECT a FROM Amenity a JOIN FETCH a.amenityRooms ar JOIN FETCH ar.room WHERE a.amenityId = :id")
    Amenity findAmenityWithRoomsById(@Param("id") Long id);
}
