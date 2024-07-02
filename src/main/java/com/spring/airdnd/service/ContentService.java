package com.spring.airdnd.service;


import com.spring.airdnd.dto.ContentResponseDTO;
import com.spring.airdnd.repository.ContentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContentService {
    private final ContentRepository contentRepository;

    public List<ContentResponseDTO> findByContentName(String contentName){
        List<ContentResponseDTO> contentList =
                contentRepository.findByContentComponent(contentName).stream().map(content -> ContentResponseDTO.from(content)).toList();

        return contentList;
    }
}
