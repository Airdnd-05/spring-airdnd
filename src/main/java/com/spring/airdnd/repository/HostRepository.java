package com.spring.airdnd.repository;

import com.spring.airdnd.entity.Host;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HostRepository extends JpaRepository<Host, Long> {
    @Query("SELECT h FROM Host h JOIN FETCH h.rooms r WHERE h.hostId = :id")
    Host findHostWithRoomsById(@Param("id") Long id);
}
