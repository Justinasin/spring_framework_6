package com.example.spring_framework_core.services;

import static java.time.LocalDateTime.now;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.spring_framework_core.model.Book;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BookServiceImpl implements BookService {

    private final Map<UUID, Book> bookMap;

    public BookServiceImpl() {
        this.bookMap = new HashMap<>();

        Book book1 = Book.builder()
                .id(UUID.randomUUID())
                .author("Author1")
                .title("Title1")
                .pages(100)
                .createdDate(now())
                .updatedDate(now())
                .build();

        Book book2 = Book.builder()
                .id(UUID.randomUUID())
                .author("Author2")
                .title("Title2")
                .pages(200)
                .createdDate(now())
                .updatedDate(now())
                .build();

        Book book3 = Book.builder()
                .id(UUID.randomUUID())
                .author("Author3")
                .title("Title3")
                .pages(300)
                .createdDate(now())
                .updatedDate(now())
                .build();

        bookMap.put(book1.getId(), book1);
        bookMap.put(book2.getId(), book2);
        bookMap.put(book3.getId(), book3);
    }

    @Override
    public List<Book> listBooks() {
        return new ArrayList<>(bookMap.values());
    }

    @Override
    public Book getBookById(UUID id) {
        log.debug("Get Book by Id - in service. Id: " + id.toString());

        return bookMap.get(id);
    }

    @Override
    public Book insertBook(Book book) {
        Book savedBook = Book.builder()
                .id(UUID.randomUUID())
                .createdDate(now())
                .updatedDate(now())
                .title(book.getTitle())
                .author(book.getAuthor())
                .pages(book.getPages())
                .build();

        bookMap.put(savedBook.getId(), savedBook);

        return savedBook;
    }

    @Override
    public void updateBook(UUID bookId, Book book) {
        Book existingBook = bookMap.get(bookId);
        if (existingBook == null) {
            throw new RuntimeException(String.format("Entity: %s not found", bookId));
        }

        existingBook.setTitle(book.getTitle());
        existingBook.setAuthor(book.getAuthor());
        existingBook.setPages(book.getPages());
        existingBook.setUpdatedDate(now());

        bookMap.put(existingBook.getId(), existingBook);
    }
}
