package com.netcracker.spring.task3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassTask3 {

    public static void main(String[] args) {

        //Tag "parent"

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextTask3.xml");
        Human human;

        human = (Human) context.getBean("human");
        System.out.println(human);

        human = (Human) context.getBean("javaD");
        System.out.println(human);

        human = (Human) context.getBean("cppD");
        System.out.println(human);

    }

}
