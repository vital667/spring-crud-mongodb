package com.example.springcrudmangodb.controller;

import com.example.springcrudmangodb.entity.Book;
import com.example.springcrudmangodb.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public Collection<Book> getAllBooks() {
        return bookService.getBooks();
    }

    @GetMapping("/title")
    public Iterable<Book> getBooks(@RequestParam String title) {
        return bookService.findByTitle(title); //.orElseThrow(()->new BookNotFoundException(title));
    }

    @GetMapping("/author")
    public Iterable<Book> getAuthors(@RequestParam String author) {
        return bookService.findByAuthor(author); //.orElseThrow(()->new BookNotFoundException(title));
    }

    @PostMapping
    public Book postBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    @DeleteMapping
    public void deleteBook(@RequestParam String author) {
        bookService.deleteByAuthor(author);
    }

}
