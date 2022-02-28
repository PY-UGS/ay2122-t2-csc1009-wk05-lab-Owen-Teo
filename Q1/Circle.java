package com.lab.lab5;

public class Circle extends GeometricObject{
    private double radius;

    public Circle(){

    }

    public Circle (double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){

    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){

    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public void setArea(){

    }

    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    public double getDiameter(){
        return 2 * radius;
    }

    public void printCircle(){}
}
