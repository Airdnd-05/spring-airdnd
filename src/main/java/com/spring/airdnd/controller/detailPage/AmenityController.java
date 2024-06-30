package com.spring.airdnd.controller.detailPage;

import com.spring.airdnd.dto.detailPage.AmenityResponseDTO;
import com.spring.airdnd.service.detailPage.AmenityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/detail")
@RequiredArgsConstructor
public class AmenityController {

    private final AmenityService amenityService;

    @GetMapping("/amenity/{roomId}")
    public ResponseEntity<List<AmenityResponseDTO>> getAmenities (@PathVariable Long roomId){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(amenityService.getAmenities(roomId));
    }
}
