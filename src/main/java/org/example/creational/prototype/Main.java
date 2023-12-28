package org.example.creational.prototype;

public class Main {
    public static void main(String[] args){
        Human human = new Human();
        Dog dog = new Dog();

        human.name = "Bob";
        human.age = 20;
        human.numOfLegs = 2;

        dog.name = "Lucky";
        dog.age = 2;
        dog.numOfLegs = 4;

        Human anotherHuman = new Human(human);
        Dog anotherDog = (Dog) dog.clone();

        System.out.println(human.equals(anotherHuman));

        System.out.println(human);
        System.out.println(anotherHuman);
    }
}
