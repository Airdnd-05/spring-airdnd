package com.spring.airdnd.dto.common;

import com.spring.airdnd.entity.WishList;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class WishListResponseDTO {

    private Long wishListId;
    private Long userId;
    private Long roomId;

    private String roomName;
    private Float roomOverallAvg;




    public static WishListResponseDTO from(WishList wishList) {
        return new WishListResponseDTO(
                wishList.getWishListId(),
                wishList.getUser().getUserId(),
                wishList.getRoom().getRoomId(),
                wishList.getRoom().getRoomName(),
                wishList.getRoom().getRoomOverallAvg()

//                wishList.getRoom().getBuildingType(),
//                wishList.getRoom().getLocation().getLocationLocal()


        );
    }
}
