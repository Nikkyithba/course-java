package com.nikky.javabasics;

import java.util.Scanner;

//Week 5 Task: Abstract classes
//Refine your task on Rectangle class to use the concept of Data abstraction
//Use the shape class

//also remember call the print() in the Rectangle class

//Please you also create another called Circle that extends Shape
//add instance variable radius and the calculate the area

public class Rectangle extends Shape{

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

    @Override
    public double calculateArea(){
        return ( length * width);

    }

}





