package com.codegym.shape;

public class testResizeable extends Circle{
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle=new Circle(4,"red",true);
        System.out.println(circle);
        circle.resize(200);
        System.out.println(circle);
    }
}
