package com.spring.airdnd.repository;

import com.spring.airdnd.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    @Query("SELECT c FROM Category c JOIN FETCH c.roomsCategories rc JOIN FETCH rc.room WHERE c.categoryId = :id")
    Category findCategoryWithRoomsById(@Param("id") Long id);
}