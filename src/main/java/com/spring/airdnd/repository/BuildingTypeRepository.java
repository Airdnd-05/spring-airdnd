package com.spring.airdnd.repository;

import com.spring.airdnd.entity.BuildingType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildingTypeRepository extends JpaRepository<BuildingType, Long> {
    @Query("SELECT bt FROM BuildingType bt JOIN FETCH bt.rooms r WHERE bt.buildingTypeId = :id")
    BuildingType findBuildingTypeWithRoomsById(@Param("id") Long id);
}
