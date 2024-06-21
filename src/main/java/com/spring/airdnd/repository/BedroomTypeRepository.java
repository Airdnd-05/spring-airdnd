package com.spring.airdnd.repository;

import com.spring.airdnd.entity.BedroomType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BedroomTypeRepository extends JpaRepository<BedroomType, Long> {
    @Query("SELECT bt FROM BedroomType bt JOIN FETCH bt.room WHERE bt.bedroomId = :id")
    BedroomType findBedroomTypeWithRoomById(@Param("id") Long id);
}