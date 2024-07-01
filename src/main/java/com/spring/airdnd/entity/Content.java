package com.spring.airdnd.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "contents")
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "content_id")
    private Integer contentId;

    @Column(name = "content_component", nullable = false, length = 30)
    private String contentComponent;

    @Column(name = "content_name", nullable = false, length = 100)
    private String contentName;

    @Column(name = "content", nullable = false, columnDefinition = "json")
    private String content;

//    @Builder
//    public Content(Integer contentId, String contentComponent, String contentName, String content) {
//        this.contentId = contentId;
//        this.contentComponent = contentComponent;
//        this.contentName = contentName;
//        this.content = content;
//    }
}
