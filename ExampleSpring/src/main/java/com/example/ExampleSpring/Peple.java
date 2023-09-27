package com.example.ExampleSpring;

public class Peple {

    private String name;
    private int rollno;

    public Peple(String name , int rollno){
        this.name = name;
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "Peple{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }
}
