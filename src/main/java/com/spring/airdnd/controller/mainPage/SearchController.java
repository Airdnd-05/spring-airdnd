package com.spring.airdnd.controller.mainPage;

import com.spring.airdnd.dto.mainPage.SearchRequestDTO;
import com.spring.airdnd.dto.mainPage.SearchResponseDTO;
import com.spring.airdnd.dto.mainPage.PageCustom;
import com.spring.airdnd.service.mainPage.SearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/rooms")
public class SearchController {

    private final SearchService roomService;

    @GetMapping("/filter")
    public ResponseEntity<PageCustom<SearchResponseDTO>> filterRooms(
            SearchRequestDTO request,
            @RequestParam(required = false, defaultValue = "0") Integer page,
            @RequestParam(required = false, defaultValue = "5") Integer size
    ) {
        PageCustom<SearchResponseDTO> rooms = roomService.getRoomsByFilters(request, page, size);
        return ResponseEntity.ok(rooms);
    }

    @GetMapping("/filter/count")
    public ResponseEntity<Long> countFilteredRooms(SearchRequestDTO request) {
        Long count = roomService.countRoomsByFilters(request);
        return ResponseEntity.ok(count);
    }
}
