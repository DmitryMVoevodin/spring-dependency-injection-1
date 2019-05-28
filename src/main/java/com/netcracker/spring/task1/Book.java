package com.netcracker.spring.task1;

public abstract class Book implements BookInterface {

    private String title;
    private Author author;
    private int pages;
    private int count;
    private double price;

    public Book() {
        //
    }

    public Book(String title, Author author, int pages, int count, double price) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.count = count;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        String s = "Book [title: " + title +"; author: " + author +
                "; pages: " + pages + "; count: " + count + "; price: " + price + "]";
        return s;
    }

}