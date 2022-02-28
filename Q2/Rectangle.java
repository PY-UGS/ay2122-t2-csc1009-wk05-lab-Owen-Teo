package com.lab.lab5Q2;

public class Rectangle extends Shape {
    public Rectangle(double width, double height) {
        super(width, height);
    }

    public double area() {
        System.out.println("Inside Area for Rectangle.");
        return super.dim1 * super.dim2;
    }

}