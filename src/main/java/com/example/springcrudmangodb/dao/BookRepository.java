package com.example.springcrudmangodb.dao;

import com.example.springcrudmangodb.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface BookRepository extends MongoRepository<Book, Integer> {
     Iterable<Book> findBookByTitle(String title);
     Iterable<Book> findByAuthor (String author);
     void deleteBookByAuthor (String author);

}
