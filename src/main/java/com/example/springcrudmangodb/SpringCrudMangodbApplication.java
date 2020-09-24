package com.example.springcrudmangodb;

import com.example.springcrudmangodb.dao.BookRepository;
import com.example.springcrudmangodb.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCrudMangodbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCrudMangodbApplication.class, args);
    }

    private BookRepository bookRepository;

    @Autowired
    public SpringCrudMangodbApplication(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        bookRepository.save(new Book("Book1", "Smith"));
        bookRepository.save(new Book("Book2", "Walter"));
    }


}
