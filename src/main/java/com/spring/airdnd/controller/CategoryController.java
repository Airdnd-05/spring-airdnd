package com.spring.airdnd.controller;

import com.spring.airdnd.dto.CategoryResponseDTO;
import com.spring.airdnd.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/category")
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("")
    public ResponseEntity<List<CategoryResponseDTO>> getCategory() {
        List<CategoryResponseDTO> response = this.categoryService.getAllCategories();
        return ResponseEntity.ok(response);
    }
}
