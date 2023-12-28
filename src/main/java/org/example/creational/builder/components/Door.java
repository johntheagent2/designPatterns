package org.example.creational.builder.components;

import org.example.creational.builder.houses.House;

public class Door {
    private Wood typeOfWood;
    private int numOfDoor;

    private House house;

    public Door(Wood typeOfWood, int numOfDoor) {
        this.typeOfWood = typeOfWood;
        this.numOfDoor = numOfDoor;
    }

    public void setHouse(House house){
        this.house = house;
    }

    public Wood getTypeOfWood() {
        return typeOfWood;
    }

    public void setTypeOfWood(Wood typeOfWood) {
        this.typeOfWood = typeOfWood;
    }

    public int getNumOfDoor() {
        return numOfDoor;
    }

    public void setNumOfDoor(int numOfDoor) {
        this.numOfDoor = numOfDoor;
    }
}
