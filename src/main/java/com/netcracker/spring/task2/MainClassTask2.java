package com.netcracker.spring.task2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassTask2 {

    public static void main(String[] args) {

        //CI and SI for List, Set, Map

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextTask2.xml");
        Harbor har;
        System.out.println("\nCI_for_List_Set_Map");
        har = context.getBean("harborCI", Harbor.class);
        System.out.println(har);
        System.out.println("\nSI_for_List_Set_Map");
        har = context.getBean("harborSI", Harbor.class);
        System.out.println(har);

    }

}
