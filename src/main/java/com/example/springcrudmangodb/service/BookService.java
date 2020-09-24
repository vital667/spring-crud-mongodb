package com.example.springcrudmangodb.service;

import com.example.springcrudmangodb.dao.BookRepository;
import com.example.springcrudmangodb.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Collection<Book> getBooks() {
        return bookRepository.findAll();
    }


    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public Iterable<Book> findByTitle(String title) {
        return bookRepository.findBookByTitle(title);
    }

    public Iterable<Book> findByAuthor(String author) {
        return bookRepository.findByAuthor(author);
    }

    public void deleteByAuthor(String author){
        bookRepository.deleteBookByAuthor(author);
    }
}
