package com.lab.lab5;

public class Rectangle extends GeometricObject {
    private double width, height;

    public Rectangle(){}

    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;

    }

    public Rectangle(double width, double height, String color, boolean filled){
        this.height = height;
        this.width = width;

    }
    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2 * (width + height);
    }


}
