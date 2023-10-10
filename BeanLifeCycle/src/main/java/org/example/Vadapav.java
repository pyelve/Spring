package org.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Vadapav implements InitializingBean, DisposableBean {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vadapav{" +
                "price=" + price +
                '}';
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Put your waste in dustbin!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Please place your order for Vadapav!");
    }
}
