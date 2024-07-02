package com.spring.airdnd.controller;

import com.spring.airdnd.dto.LocationResponseDTO;
import com.spring.airdnd.service.LocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/navbar")
@RequiredArgsConstructor
public class NavBarController {
    private final LocationService locationService;

    @GetMapping("/city")
    public ResponseEntity<List<LocationResponseDTO>> getCity(){
        List<LocationResponseDTO> navBarCityList = locationService.findAll();
        return ResponseEntity.ok(navBarCityList);
    }
}
