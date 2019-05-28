package com.netcracker.spring.task6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassTask6 {

    public static void main(String[] args) {

        //FactoryMethod

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextTask6.xml");

        Film film = context.getBean("film1", Film.class);
        System.out.println(film);
        film = context.getBean("film2", Film.class);
        System.out.println(film);

    }

}
