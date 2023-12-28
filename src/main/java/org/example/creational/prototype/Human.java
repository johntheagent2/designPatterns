package org.example.creational.prototype;

public class Human extends Animal{
    public String name;
    private String address;


    public Human() {
        address = "Address";
    }

    public Human(Human human) {
        super(human);
        if(human != null){
            this.name = human.name;
            this.address = human.address;
        }
    }

    @Override
    public Human clone() {
        return new Human(this);
    }

    public void sayHi(){
        System.out.println(name + "says hi");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", numOfLegs=" + numOfLegs +
                ", address=" + address +
                '}';
    }
}
