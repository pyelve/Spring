package com.example.ExampleSpring;

public class Shape {

   private Triangle triangle;
   private Square square;

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }

    public void drow(){
        triangle.drow();
        square.drow();
    }
}
