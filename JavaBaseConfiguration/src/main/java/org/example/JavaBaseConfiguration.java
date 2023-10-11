package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class JavaBaseConfiguration {
    public static void main(String[] args) {
        SpringApplication.run(JavaBaseConfiguration.class, args);

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Car car = context.getBean(Car.class);
        car.move();

        Bike bike = context.getBean(Bike.class);
        bike.move();

        Travel travel = context.getBean(Travel.class);
        travel.move();

    }
}
