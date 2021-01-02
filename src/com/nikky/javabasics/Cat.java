package com.nikky.javabasics;

public class Cat extends Animal {
    @Override
    public void makeSound(){
        System.out.println("Weoow!");
    }

    public void scratch(){
        System.out.println("Always making scratches");
    }
}
