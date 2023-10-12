package org.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TypeOfDependancy {
    public static void main(String args[]){
       // SpringApplication.run(TypeOfDependancy.class, args);

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Employee emp = (Employee)context.getBean("emp");
        System.out.println(emp);

    }
}
