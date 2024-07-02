package com.spring.airdnd.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.spring.airdnd.entity.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContentRepository extends JpaRepository<Content, Long> {

    List<Content> findByContentComponent(String contentName);
}
