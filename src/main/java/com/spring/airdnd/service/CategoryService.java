package com.spring.airdnd.service;

import com.spring.airdnd.dto.CategoryResponseDTO;
import com.spring.airdnd.entity.Category;
import com.spring.airdnd.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public List<CategoryResponseDTO>
    getAllCategories(){

        List<Category> categories = this.categoryRepository.findAll();
        return categories.stream().map(CategoryResponseDTO::from).collect(Collectors.toList());
    }
}
