package com.codegym.shape;

public class test extends Triangle{
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);

        triangle = new Triangle("red", true, 3, 2, 3);
        System.out.println(triangle);
    }
}
