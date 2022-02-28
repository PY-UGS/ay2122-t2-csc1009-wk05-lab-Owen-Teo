package com.lab.lab5Q2;

public class Triangle extends Shape {
    public Triangle(double width, double height) {
        super(width, height);
    }

    public double area() {
        System.out.println("Inside Area for Triangle.");
        return 0.5 * super.dim1 * super.dim2;
    }

}
