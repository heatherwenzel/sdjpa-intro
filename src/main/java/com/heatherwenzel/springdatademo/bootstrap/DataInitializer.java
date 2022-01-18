package com.heatherwenzel.springdatademo.bootstrap;

import com.heatherwenzel.springdatademo.domain.Book;
import com.heatherwenzel.springdatademo.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile({"local", "default"})
@Component
public class DataInitializer implements CommandLineRunner {

    private final BookRepository bookRepository;

    public DataInitializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void run(String... args) throws Exception {

        bookRepository.deleteAll();

        Book bookDDD = new Book("Domain Driven Design", "123", "Random House");
        System.out.println("ID: " + bookDDD.getId());

        Book savedDDD = bookRepository.save(bookDDD);
        System.out.println("ID: " + bookDDD.getId());

        Book bookSIA = new Book("Spring in Action", "456", "OReilly");
        Book savedSIA = bookRepository.save(bookSIA);

        bookRepository.findAll().forEach(book -> {
            System.out.println("Book ID: " + book.getId());
            System.out.println("Book title: " + book.getTitle());
        });

    }
}
