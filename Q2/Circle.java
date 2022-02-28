package com.lab.lab5Q2;

public class Circle extends Shape {
    public Circle(double radius, double radius2){
        super(radius, radius2);

    }

    public double area(){
        System.out.println("Inside Area for Circle.");
        return super.dim1 * super.dim2 * super.PI;
    }

}
