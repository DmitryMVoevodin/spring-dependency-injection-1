package com.netcracker.spring.task5;

import com.netcracker.spring.task5.forAnnotation.Refrigerator;
import com.netcracker.spring.task5.forByName.Lake;
import com.netcracker.spring.task5.forByType.Sky;
import com.netcracker.spring.task5.forConstructor.Forest;
import com.netcracker.spring.task5.forNo.Space;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassTask5 {

    public static void main(String[] args) {

        //Autowiring

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextTask5.xml");

        System.out.println("\nAutowiring - byName");
        Lake lake = context.getBean("lake", Lake.class);
        System.out.println(lake);

        System.out.println("\nAutowiring - byType");
        Sky sky = context.getBean("sky", Sky.class);
        System.out.println(sky);

        System.out.println("\nAutowiring - constructor");
        Forest forest = context.getBean("forest", Forest.class);
        System.out.println(forest);

        System.out.println("\nAutowiring - no");
        Space space = context.getBean("space", Space.class);
        System.out.println(space);

        System.out.println("\nAutowiring - annotation");
        Refrigerator refrigerator = context.getBean("refrigerator", Refrigerator.class);
        System.out.println(refrigerator);

    }

}
