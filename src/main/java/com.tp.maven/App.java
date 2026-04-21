package com.tp.maven;

import com.tp.maven.model.Book;
import com.tp.maven.service.LibraryService;
import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {
        String env = System.getProperty("app.environment", "Non défini");

        LibraryService service = new LibraryService();
        service.addBook(new Book("Clean Code", "Robert Martin", 2008));
        service.addBook(new Book("Effective Java", "Joshua Bloch", 2018));
        service.addBook(new Book("Clean Architecture", "Robert Martin", 2017));

        String separator = StringUtils.repeat("-", 40);

        System.out.println(separator);
        System.out.println("Environnement : " + env);
        System.out.println("Nombre total de livres : " + service.countBooks());

        System.out.println("Tous les livres :");
        service.getAllBooks().forEach(System.out::println);

        System.out.println("Livres de Robert Martin :");
        service.findByAuthor("Robert Martin").forEach(System.out::println);

        System.out.println(separator);
    }
}