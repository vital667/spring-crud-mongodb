package com.example.springcrudmangodb.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
//@Document(collection = "Book")
public class Book {

//    @Id
//    private Integer id;
    private String title;
    private String author;

}
