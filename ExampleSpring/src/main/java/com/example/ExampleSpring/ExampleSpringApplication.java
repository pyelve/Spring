package com.example.ExampleSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ExampleSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleSpringApplication.class, args);
		ApplicationContext context =  new ClassPathXmlApplicationContext("beans.xml");
		Student obj = (Student)context.getBean("student");
		System.out.println("Welcome to the first Demo project");

		Shape obj1 = (Shape) context.getBean("shape");
		obj1.drow();
		System.out.println(obj);

		Peple peple = (Peple) context.getBean("peple");
		System.out.println(peple);
	}

}
