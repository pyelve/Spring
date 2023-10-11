package org.example;

public class Travel {

    private Vehicle vehicle;

    public Travel(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public void move(){
        vehicle.move();
    }
}
