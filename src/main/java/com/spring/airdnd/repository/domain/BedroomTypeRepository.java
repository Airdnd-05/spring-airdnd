package com.spring.airdnd.repository.domain;

import com.spring.airdnd.entity.BedroomType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BedroomTypeRepository extends JpaRepository<BedroomType, Long> {

    List<BedroomType> findByRoom_RoomId( Long roomId);

}
