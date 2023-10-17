package com.example.spring_framework_core.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_framework_core.model.Book;
import com.example.spring_framework_core.services.BookService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@RestController
public class BookController {

    private final BookService bookService;

    @RequestMapping("/api/v1/book")
    public List<Book> listBooks() {
        return bookService.listBooks();
    }

    @RequestMapping("/api/v1/book/{bookId}")
    public Book getBookById(UUID bookId) {

        log.debug("Get Book by Id - in controller");

        return bookService.getBookById(bookId);
    }
}
