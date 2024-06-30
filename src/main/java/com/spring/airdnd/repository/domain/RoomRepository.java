package com.spring.airdnd.repository.domain;


import com.spring.airdnd.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{

    //Optional<Room> findById(Long roomId);

    Room findByRoomId(Long roomId);

}
