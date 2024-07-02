package com.spring.airdnd.service;

import com.spring.airdnd.dto.HistogramDataResponseDTO;
import com.spring.airdnd.repository.HistogramDataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class HistogramDataService {

    private final HistogramDataRepository histogramDataRepository;

    public List<HistogramDataResponseDTO> getHistogramDataCounts() {
        return histogramDataRepository.findAll()
                                      .stream()
                                      .map(HistogramDataResponseDTO::from)
                                        .collect(Collectors.toList());
    }
}
