package org.example.creational.prototype;

public abstract class Animal {
    public int age;
    public int numOfLegs;

    public Animal(){}

    public Animal(Animal animal){
        if(animal != null){
            this.age = animal.age;
            this.numOfLegs = animal.numOfLegs;
        }
    }

    public void move(){
        if(this.numOfLegs < 2){
            System.out.println("This animal crawl");
        }else{
            System.out.println("This animal walk");
        }
    }

    public abstract Animal clone();
}
