package com.netcracker.spring.task1.implem;

import com.netcracker.spring.task1.Author;
import com.netcracker.spring.task1.Book;

public class PaperBook extends Book {

    public PaperBook() {
        super();
    }

    public PaperBook(String title, Author author, int pages, int count, double price) {
        super(title, author, pages, count, price);
    }

    @Override
    public String type() {
        return "Paper book";
    }

    @Override
    public String toString() {
        return (super.toString() + "; type: " + type());
    }

}
