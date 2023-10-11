package org.example;

import ch.qos.logback.core.net.SyslogOutputStream;

public class Car implements Vehicle {

    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}
