package com.spring.airdnd.repository.domain;

import com.spring.airdnd.entity.AmenityRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmenityRoomRepository extends JpaRepository<AmenityRoom, Long> {
}
