package com.nikky.javabasics;

public class Dog extends Animal{

    @Override
    public void makeSound(){
        System.out.println("Woof ! Woof !");
    }
    public void chewing(){
        System.out.println("Always chewing everything in the house");
    }
}
