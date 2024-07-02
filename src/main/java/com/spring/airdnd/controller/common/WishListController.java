package com.spring.airdnd.controller.common;

import com.spring.airdnd.dto.common.WishListRequestDTO;
import com.spring.airdnd.dto.common.WishListResponseDTO;
import com.spring.airdnd.service.common.WishListService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wishlist")
@RequiredArgsConstructor
public class WishListController {

    private WishListService wishListService;

    @GetMapping("{id}")
    public ResponseEntity<List<WishListResponseDTO>> getWishList(@PathVariable("userId") Long userId) {
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(wishListService.getWishList(userId));

    }

//    public ResponseEntity<WishListResponseDTO> addWishList(@RequestBody WishListRequestDTO) {
//        return WishListService.addWishList(userID, roomId)
//    }
}
