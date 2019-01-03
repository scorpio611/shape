package com.codegym.shape;

public class testColorable extends Square{
    public static void main(String[] args) {
        Square square = new Square();
        square.howToColor();
        square = new Square(4,"red",true);
        square.howToColor();
        square = new Square(5,"blue",false);
        square.howToColor();
    }
}
