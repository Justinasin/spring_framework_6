package com.example.spring_framework_core.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_framework_core.model.Book;
import com.example.spring_framework_core.services.BookService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/book")
public class BookController {

    private final BookService bookService;

    @GetMapping()
    public List<Book> listBooks() {
        return bookService.listBooks();
    }

    @GetMapping(value = "{bookId}")
    public Book getBookById(@PathVariable("bookId") UUID bookId) {

        log.debug("Get Book by Id - in controller");

        return bookService.getBookById(bookId);
    }

    @PostMapping
    public ResponseEntity insertBook(@RequestBody Book book) {
        Book insertedBook = bookService.insertBook(book);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Location", String.format("/api/v1/book - %s", insertedBook.getId()));

        return new ResponseEntity(httpHeaders, HttpStatus.CREATED);
    }
}
