package com.netcracker.spring.task1;

public interface BookInterface {

    String type();
    void setTitle(String title);
    void setAuthor(Author author);
    void setPages(int pages);
    void setCount(int count);
    void setPrice(double price);

}
