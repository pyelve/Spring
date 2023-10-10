package org.example;

public class Burger {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void init(){
        System.out.println("Place the Order of Burger !");
    }

    public void destroy(){
        System.out.println("Please put your plates on the cleaning counter !");
    }

    @Override
    public String toString() {
        return "Burger{" +
                "price=" + price +
                '}';
    }
}
