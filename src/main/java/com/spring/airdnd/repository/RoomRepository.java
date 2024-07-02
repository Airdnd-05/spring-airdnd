package com.spring.airdnd.repository;

import com.spring.airdnd.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long>, SearchRepository {
@Query("SELECT r FROM Room r JOIN FETCH r.location JOIN FETCH r.buildingType WHERE r.roomId = :roomId")
Room findRoomWithDetails(@Param("roomId") Long roomId);
Optional<Room> findById(Long roomId);
}
