package com.netcracker.spring.task6;

public class FilmFactory {

    public Film createFilm() {
        System.out.println("We have just been in the body of the method createFilm() of the class FilmFactory!");
        return new Film();
    }

}
