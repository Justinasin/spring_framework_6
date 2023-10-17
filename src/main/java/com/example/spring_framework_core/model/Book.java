package com.example.spring_framework_core.model;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Book {
    private UUID id;
    private String title;
    private String author;
    private int pages;
    private LocalDateTime created;
}
