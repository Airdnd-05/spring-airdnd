package com.spring.airdnd.repository.detailPage;

import com.spring.airdnd.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{
@Query("SELECT r FROM Room r JOIN FETCH r.location JOIN FETCH r.buildingType WHERE r.roomId = :roomId")
Room findRoomWithDetails(@Param("roomId") Long roomId);
Optional<Room> findById(Long roomId);
}
