package com.spring.airdnd.repository.domain;

import com.spring.airdnd.entity.BedroomType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BedroomTypeRepository extends JpaRepository<BedroomType, Long> {
}
