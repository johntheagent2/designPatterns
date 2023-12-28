package org.example.creational.prototype;

public class Dog extends Animal{
    public String name;

    public Dog() {}

    public Dog(Dog dog) {
        super(dog);
        if(dog != null){
            this.name = dog.name;
        }
    }

    @Override
    public Animal clone() {
        return new Dog(this);
    }

    public void bark(){
        System.out.println(name + " bark");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", numOfLegs=" + numOfLegs +
                '}';
    }
}
