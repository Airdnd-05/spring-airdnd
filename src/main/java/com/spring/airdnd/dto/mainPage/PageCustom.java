package com.spring.airdnd.dto.mainPage;

import lombok.*;

import java.util.List;

@Getter
@AllArgsConstructor
public class PageCustom<T> {
    private List<T> content;
    private int totalPages;
    private long totalElements;
    private int size;
    private int number;
    private boolean first;
    private boolean last;
}
