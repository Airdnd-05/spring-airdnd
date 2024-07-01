package com.spring.airdnd.repository.domain;

import com.spring.airdnd.entity.HistogramData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistogramDataRepository extends JpaRepository<HistogramData, Integer> {
}
