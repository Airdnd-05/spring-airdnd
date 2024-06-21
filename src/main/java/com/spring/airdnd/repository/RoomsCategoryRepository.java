package com.spring.airdnd.repository;

import com.spring.airdnd.entity.RoomsCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomsCategoryRepository extends JpaRepository<RoomsCategory, Long> {
}