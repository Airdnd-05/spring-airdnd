package com.spring.airdnd.service.detailPage;


import com.spring.airdnd.dto.detailPage.AmenityResponseDTO;
import com.spring.airdnd.entity.Amenity;
import com.spring.airdnd.repository.domain.AmenityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AmenityService {

    private final AmenityRepository amenityRepository;

    public List<AmenityResponseDTO> getAmenities(Long roomId){
        List<Amenity> amenities = amenityRepository.findByRoom_roomId(roomId);

        return amenities.stream().map(amenity -> AmenityResponseDTO.from(amenity)).collect(Collectors.toList());
    }
}
