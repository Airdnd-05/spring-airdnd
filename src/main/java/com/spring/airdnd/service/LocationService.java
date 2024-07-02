package com.spring.airdnd.service;

import com.spring.airdnd.dto.LocationResponseDTO;
import com.spring.airdnd.entity.Location;
import com.spring.airdnd.repository.LocationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LocationService {
    private final LocationRepository locationRepository;
    public List<LocationResponseDTO> findAll() {
        List<Location> locations = locationRepository.findAll();
        List<LocationResponseDTO> cities = locations.stream().map(location -> LocationResponseDTO.from(location)).collect(Collectors.toList());
        return cities;
    }
}
