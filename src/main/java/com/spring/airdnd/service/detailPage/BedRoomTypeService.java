package com.spring.airdnd.service.detailPage;

import com.spring.airdnd.dto.detailPage.BedRoomTypeResponseDTO;
import com.spring.airdnd.entity.BedroomType;
import com.spring.airdnd.repository.domain.BedroomTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BedRoomTypeService {

    private final BedroomTypeRepository bedroomTypeRepository;

    public List<BedRoomTypeResponseDTO> getBedRoomTypeList(Long roomId){
        List<BedroomType> bedroomTypeList = bedroomTypeRepository.findByRoom_RoomId(roomId);
        return bedroomTypeList.stream().map(bedroomType -> BedRoomTypeResponseDTO.from(bedroomType)).toList();

    }


}
