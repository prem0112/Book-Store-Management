package com.BookStore.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "mybooks")
public class MyBookList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;   // primary key for mybooks table

    private String name;
    private String author;
    private String price;

    @Column(name = "book_id")   // foreign key to Book
    private int bookId;

    // Default constructor
    public MyBookList() {}

    // Parameterized constructor
    public MyBookList(int bookId, String name, String author, String price) {
        this.bookId = bookId;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

//    @Override
//    public String toString() {
//        return "MyBookList{" +
//                "id=" + id +
//                ", bookId=" + bookId +
//                ", name='" + name + '\'' +
//                ", author='" + author + '\'' +
//                ", price='" + price + '\'' +
//                '}';
//    }
}
