package com.nikky.javabasics;

public class Zoo {
    public static void main(String[] args){

        //we can have animal type but with a dog instance
        Animal rocky = new Dog();
        rocky.makeSound();
        feedAnimal(rocky);
        //This is the whole concept of polymorphism
        //this is because rocky is of type Animal
        //Rocky can also have its own behaviours that are distinct
        //and we can still make rocky exhibit more specific behavior
        //through type casting
        ((Dog)rocky).chewing();

        Animal myCat = new Cat();
        myCat.makeSound();
        feedAnimal(myCat);
    }
    public static void feedAnimal(Animal animal){
        if (animal instanceof Dog ){
            System.out.println("Give rocky chicken pieces");
        }else if (animal instanceof Cat){
            System.out.println("Give myCat milk to drink");
        }
    }
}
