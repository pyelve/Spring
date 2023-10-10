package org.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Samosa {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @PostConstruct
    public void init(){
        System.out.println("Place the order for Samosa!");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Pay your Bill for Samosa!");
    }
    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }
}
