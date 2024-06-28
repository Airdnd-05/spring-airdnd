package com.spring.airdnd.repository.domain;

import com.spring.airdnd.entity.WishList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishListRepository extends JpaRepository<WishList, Long> {
}
