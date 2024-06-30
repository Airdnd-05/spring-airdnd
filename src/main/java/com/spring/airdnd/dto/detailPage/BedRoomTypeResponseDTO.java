package com.spring.airdnd.dto.detailPage;


import com.spring.airdnd.entity.BedroomType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BedRoomTypeResponseDTO {

    private String typeBedroomName;
    private String typeBed;

    public static BedRoomTypeResponseDTO from(BedroomType bedroomType){
        return new BedRoomTypeResponseDTO(
                bedroomType.getTypeBedroomName(),
                bedroomType.getTypeBedAndIcon()
        );
    }

}
