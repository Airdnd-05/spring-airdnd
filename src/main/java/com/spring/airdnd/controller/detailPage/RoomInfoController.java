package com.spring.airdnd.controller.detailPage;


import com.spring.airdnd.service.detailPage.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/detail")
@RequiredArgsConstructor
public class RoomInfoController {

    private final RoomService roomService;

    @GetMapping("/roominfo/{roomId}")
    public ResponseEntity<String> getRoomInfo(@PathVariable Long roomId){
        String roomInfo = roomService.getRoomInfo(roomId);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(roomInfo);
    }
}
