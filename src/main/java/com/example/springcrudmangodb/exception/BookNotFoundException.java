package com.example.springcrudmangodb.exception;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(String title) {
        super("Could not find book: "+title);
    }
}
