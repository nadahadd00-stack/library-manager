package com.tp.maven.service;

import com.tp.maven.model.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryServiceTest {

    @Test
    void testAddBook() {
        LibraryService service = new LibraryService();
        service.addBook(new Book("Clean Code", "Robert Martin", 2008));
        assertEquals(1, service.getAllBooks().size());
    }

    @Test
    void testCountBooks() {
        LibraryService service = new LibraryService();
        service.addBook(new Book("Book1", "A", 2000));
        service.addBook(new Book("Book2", "B", 2001));
        assertEquals(2, service.countBooks());
    }

    @Test
    void testFindByAuthor() {
        LibraryService service = new LibraryService();
        service.addBook(new Book("Clean Code", "Robert Martin", 2008));
        service.addBook(new Book("Java", "James Gosling", 1995));
        assertEquals(1, service.findByAuthor("Robert Martin").size());
    }
}