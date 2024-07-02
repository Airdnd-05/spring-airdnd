package com.spring.airdnd.controller;

import com.spring.airdnd.dto.HostInfoDTO;

import com.spring.airdnd.service.HostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Host")
public class HostController {

    private final HostService hostService;

    @GetMapping("")
    public ResponseEntity<List<HostInfoDTO>> getHost() {
        List<HostInfoDTO> response = this.hostService.getAllHosts();
        return ResponseEntity.ok(response);
    }
}
