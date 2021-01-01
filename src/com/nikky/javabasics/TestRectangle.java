package com.nikky.javabasics;

public class TestRectangle{

    public static void main (String[] args){

        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(3, 4);

        rect1.setLength(2);          
        rect1.setWidth(3);
        System.out.println("The length and width of the rectangle1 is: " + rect1.getLength() + "  &  " + rect1.getWidth());
        double area1 = rect1.calculateArea();
        System.out.println("The area of the rectangle1 is " + area1);

        System.out.println("The length and width of the rectangle2 is: " + rect2.getLength() + "  &  "+ rect2.getWidth());
        double area2 = rect2.calculateArea();
        System.out.println("The area of rectangle2 is " + area2);


    }

}

