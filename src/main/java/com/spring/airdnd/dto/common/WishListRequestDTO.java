package com.spring.airdnd.dto.common;

import com.spring.airdnd.entity.WishList;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class WishListRequestDTO {

    private Long wishListId;
    private Long userId;
    private Long roomId;

    private String roomName;
    private Float roomOverallAvg;




    public static WishListRequestDTO from(WishList wishList) {
        return new WishListRequestDTO(wishList.getWishListId(), wishList.getUser().getUserId(), wishList.getRoom().getRoomId(), wishList.getRoom().getRoomName(), wishList.getRoom().getRoomOverallAvg());
    }
}
