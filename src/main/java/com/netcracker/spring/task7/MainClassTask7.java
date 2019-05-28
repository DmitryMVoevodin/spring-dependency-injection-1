package com.netcracker.spring.task7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassTask7 {

    public static void main(String[] args) {

        //LookupMethodInjection

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextTask7.xml");

        System.out.println("\nWITHOUT lookup method injection: the engine remains the same even though it has been marked as \"prototype\"");
        for(int i = 0; i < 10; ++i) {
            CarFactory carfac1 = context.getBean("carfac1", CarFactory.class);
            Engine engine1 = carfac1.getEngine();
            System.out.println(engine1);
        }
        System.out.println("\nWITH lookup method injection: the engine is new after each iteration");
        for(int i = 0; i < 10; ++i) {
            CarFactoryWithLookup carfac2 = context.getBean("carfac2", CarFactoryWithLookup.class);
            Engine engine2 = carfac2.lookupForEngine();
            System.out.println(engine2);
        }

    }

}