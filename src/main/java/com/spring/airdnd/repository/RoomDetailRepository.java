package com.spring.airdnd.repository;

import com.spring.airdnd.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoomDetailRepository extends JpaRepository<Room, Long> {
    Optional<Room> findByRoomId(Long roomId);
}
