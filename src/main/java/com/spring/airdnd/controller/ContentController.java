package com.spring.airdnd.controller;


import com.spring.airdnd.dto.ContentResponseDTO;
import com.spring.airdnd.service.ContentService;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.descriptor.web.ContextService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/content")
public class ContentController {

    private final ContentService contentService;

    @GetMapping("/booking/{contentName}")
    public ResponseEntity<List<ContentResponseDTO>> getBookingOptionContent(@PathVariable String contentName){

        List<ContentResponseDTO> contentList = contentService.findByContentName(contentName);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(contentList);

    }
}
