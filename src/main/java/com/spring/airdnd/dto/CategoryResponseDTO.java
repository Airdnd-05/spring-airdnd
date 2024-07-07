package com.spring.airdnd.dto;


import com.spring.airdnd.entity.Category;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CategoryResponseDTO {
    private Long categoryId;
    private String categoryName;
    private String categorySvg;

    public static CategoryResponseDTO from(Category category){
        return new CategoryResponseDTO(
                category.getCategoryId(),
                category.getCategoryName(),
                category.getCategorySvg()
        );
    }
}
