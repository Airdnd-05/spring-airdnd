package com.spring.airdnd.repository;

import com.spring.airdnd.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
    @Query("SELECT r FROM Room r " +
            "JOIN FETCH r.host h " +
            "JOIN FETCH r.location l " +
            "JOIN FETCH r.buildingType b " +
            "JOIN FETCH r.amenityRooms ar " +
            "JOIN FETCH ar.amenity a " +
            "JOIN FETCH r.bedroomTypes bt " +
            "JOIN FETCH r.roomsCategories rc " +
            "JOIN FETCH rc.category c " +
            "WHERE r.roomsId = :id")
    Room findRoomWithAllDetailsById(@Param("id") Long id);

    @Query("SELECT DISTINCT r FROM Room r " +
            "JOIN FETCH r.host h " +
            "JOIN FETCH r.location l " +
            "JOIN FETCH r.buildingType b " +
            "JOIN FETCH r.amenityRooms ar " +
            "JOIN FETCH ar.amenity a " +
            "JOIN FETCH r.bedroomTypes bt " +
            "JOIN FETCH r.roomsCategories rc " +
            "JOIN FETCH rc.category c")
    List<Room> findAllRoomsWithAllDetails();
}