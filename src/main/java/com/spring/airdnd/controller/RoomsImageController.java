package com.spring.airdnd.controller;

import com.spring.airdnd.dto.RoomsImageResponseDTO;
import com.spring.airdnd.service.RoomsImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rooms/image")
@RequiredArgsConstructor
public class RoomsImageController {

    private final RoomsImageService RoomsImageService;

    @GetMapping("")
    public ResponseEntity<List<RoomsImageResponseDTO>> getRoomsImageList() {
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(this.RoomsImageService.getRoomsImageList());

    }

    @GetMapping("/{id}")
    public ResponseEntity<RoomsImageResponseDTO> getRoomsImage(@PathVariable("id") Long id) {
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(this.RoomsImageService.getRoomsImage(id));

    }
}
