package com.spring.airdnd.controller.detailPage;

import com.spring.airdnd.dto.detailPage.RoomResponseDTO;
import com.spring.airdnd.service.detailPage.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class RoomController {

    private final RoomService roomService;

    @GetMapping("/room/{roomId}")
    public ResponseEntity<RoomResponseDTO> getRoomDetail(@PathVariable Long roomId) {
        return ResponseEntity.ok(this.roomService.getRoomDetail(roomId));
    }
}
