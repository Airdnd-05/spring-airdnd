package com.spring.airdnd.controller.detailPage;


import com.spring.airdnd.dto.detailPage.BedRoomTypeResponseDTO;
import com.spring.airdnd.service.detailPage.BedRoomTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/detail")
public class BedRoomTypeController {

    private final BedRoomTypeService bedRoomTypeService;

    @GetMapping("/bedtype/{roomId}")
    public ResponseEntity<List<BedRoomTypeResponseDTO>> getBedRoomTypeList(@PathVariable Long roomId){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(bedRoomTypeService.getBedRoomTypeList(roomId));
    }
}
