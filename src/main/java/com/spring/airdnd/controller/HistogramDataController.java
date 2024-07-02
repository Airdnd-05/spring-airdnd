package com.spring.airdnd.controller;

import com.spring.airdnd.dto.HistogramDataResponseDTO;
import com.spring.airdnd.service.HistogramDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/filterModal")
@RequiredArgsConstructor
public class HistogramDataController {

    private final HistogramDataService histogramDataService;

    @GetMapping("/histogramData")
    public List<HistogramDataResponseDTO> getHistogramData() {
        return histogramDataService.getHistogramDataCounts();
    }
}
