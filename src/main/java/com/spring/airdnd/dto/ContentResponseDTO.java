package com.spring.airdnd.dto;


import com.spring.airdnd.entity.Content;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ContentResponseDTO {
    private String componentName;
    private String contentName;
    private String content;


    public static ContentResponseDTO from(Content content){
        return new ContentResponseDTO(
                content.getContentComponent(),
                content.getContentName(),
                content.getContent()
        );
    }
}
