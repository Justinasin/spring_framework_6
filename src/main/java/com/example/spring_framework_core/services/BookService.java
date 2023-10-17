package com.example.spring_framework_core.services;

import java.util.List;
import java.util.UUID;

import com.example.spring_framework_core.model.Book;

public interface BookService {

    List<Book> listBooks();

    Book getBookById(UUID id);

    Book insertBook(Book book);

    void updateBook(UUID bookId, Book book);
}
