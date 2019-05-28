package com.netcracker.spring.task1.implem;

import com.netcracker.spring.task1.Author;
import com.netcracker.spring.task1.Book;

public class AudioBook extends Book {

    public AudioBook() {
        super();
    }

    public AudioBook(String title, Author author, int pages, int count, double price) {
        super(title, author, pages, count, price);
    }

    @Override
    public String type() {
        return "Audio book";
    }

    @Override
    public String toString() {
        return (super.toString() + "; type: " + type());
    }

}
