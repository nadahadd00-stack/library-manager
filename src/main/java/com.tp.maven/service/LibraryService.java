package com.tp.maven.service;

import com.tp.maven.model.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryService {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public List<Book> findByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }

    public int countBooks() {
        return books.size();
    }
}