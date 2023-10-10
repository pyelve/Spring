package org.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BeanLifeCycle {
    public static void main(String args[]){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Configuration.xml");
        Burger burger = (Burger) context.getBean("burger");
        System.out.println(burger);
        context.registerShutdownHook();

        Vadapav vadapav = (Vadapav)context.getBean("vadapav");
        System.out.println(vadapav);
        context.registerShutdownHook();

//        Bean lifecycle implimenting by Annotations
        Samosa samosa = (Samosa) context.getBean("samosa");
        System.out.println(samosa);
        context.registerShutdownHook();
    }
}
