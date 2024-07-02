package com.spring.airdnd.service.common;

import com.spring.airdnd.dto.common.WishListResponseDTO;
import com.spring.airdnd.repository.domain.WishListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class WishListService {
    private final WishListRepository wishListRepository;



    public List<WishListResponseDTO> getWishList(Long userId) {

        return
    }

//    public void addWishList(Long userID, Long roomId) {
//        return wishListRepository.save()
//    }
}
