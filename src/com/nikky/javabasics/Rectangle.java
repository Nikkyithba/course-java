package com.nikky.javabasics;

import java.util.Scanner;

public class Rectangle {

    private double length;
    private double width ;

    public void setLength(double l) {
        length = l;
    }

    public void setWidth(double w) {
        width = w;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public Rectangle(){ }
    public Rectangle (double l , double w){
        length = l;
        width = w;

    }

    public double calculateArea(){
        return ( length * width);

    }

}





