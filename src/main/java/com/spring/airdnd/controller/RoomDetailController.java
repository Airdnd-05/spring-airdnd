package com.spring.airdnd.controller;

import com.spring.airdnd.dto.RoomDescriptionResponseDTO;
import com.spring.airdnd.dto.RoomGuestFavoriteResponseDTO;
import com.spring.airdnd.dto.RoomPriceResponseDTO;
import com.spring.airdnd.service.RoomDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/rooms")
public class RoomDetailController {
    private final RoomDetailService roomDetailService;

    @GetMapping("/description/{id}")
    public ResponseEntity<RoomDescriptionResponseDTO> getRoomDescription(@PathVariable("id") Long
                                                                         id) {
        RoomDescriptionResponseDTO responseBody = this.roomDetailService.getRoomDescription(id);
        return ResponseEntity.status(HttpStatus.OK).body(responseBody);
    }

    @GetMapping("/guestFavorite/{id}")
    public ResponseEntity<RoomGuestFavoriteResponseDTO> getRoomGuestFavorite(@PathVariable("id") Long
                                                                             id) {
        RoomGuestFavoriteResponseDTO responseBody = this.roomDetailService.getRoomGuestFavorite(id);
        return ResponseEntity.status(HttpStatus.OK).body(responseBody);
    }

    @GetMapping("/pricePerDay/{id}")
    public ResponseEntity<RoomPriceResponseDTO> getPricePerDay(@PathVariable("id") Long id) {
        RoomPriceResponseDTO responseBody = this.roomDetailService.getPricePerDay(id);
        return ResponseEntity.status(HttpStatus.OK).body(responseBody);
    }
}
