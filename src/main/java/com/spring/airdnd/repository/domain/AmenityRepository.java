package com.spring.airdnd.repository.domain;

import com.spring.airdnd.entity.Amenity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AmenityRepository extends JpaRepository<Amenity, Long> {

    @Query("SELECT DISTINCT a FROM Amenity a JOIN FETCH a.amenityRoomList ar JOIN FETCH ar.room r WHERE r.roomId = :roomId")
    List<Amenity> findByRoom(@Param("roomId") Long roomId);

}
