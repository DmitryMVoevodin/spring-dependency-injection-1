package com.netcracker.spring.task4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassTask4 {

    public static void main(String[] args) {

        //SpEL

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextTask4.xml");
        Human human = context.getBean("human", Human.class);
        System.out.println(human);

    }

}
