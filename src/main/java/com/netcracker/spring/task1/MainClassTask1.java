package com.netcracker.spring.task1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassTask1 {

    public static void main(String[] args) {

        //CI and SI for primitive types and objects

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextTask1.xml");
        BookInterface bookI;

        System.out.println("\nCI_for_Book & SI_for_Author");
        bookI = context.getBean("bookCI1", BookInterface.class);
        System.out.println(bookI);
        System.out.println("\nCI_for_Book & CI_for_Author");
        bookI = context.getBean("bookCI2", BookInterface.class);
        System.out.println(bookI);
        System.out.println("\nSI_for_Book & SI_for_Author");
        bookI = context.getBean("bookSI1", BookInterface.class);
        System.out.println(bookI);
        System.out.println("\nSI_for_Book & CI_for_Author");
        bookI = context.getBean("bookSI2", BookInterface.class);
        System.out.println(bookI);

        System.out.println("\nBooks without authors (i.e. with the \"joint\" bean)");
        bookI = context.getBean("bookWithoutAuthor1", BookInterface.class);
        System.out.println(bookI);
        bookI = context.getBean("bookWithoutAuthor2", BookInterface.class);
        System.out.println(bookI);

    }

}
