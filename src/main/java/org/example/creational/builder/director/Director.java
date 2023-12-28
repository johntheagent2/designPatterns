package org.example.creational.builder.director;

import org.example.creational.builder.builders.Builder;
import org.example.creational.builder.components.Door;
import org.example.creational.builder.components.HouseType;
import org.example.creational.builder.components.Wood;

public class Director {
    public void constructPenHouse(Builder builder){
        builder.setHouseType(HouseType.PEN_HOUSE);
        builder.setPool(true);
    }

    public void constructBungalow(Builder builder){
        builder.setDoor(new Door(Wood.PINE, 4));
        builder.setHouseType(HouseType.BUNGALOW);
        builder.setPool(false);
    }

    public void constructCondo(Builder builder){
        builder.setDoor(new Door(Wood.OAK, 2));
        builder.setHouseType(HouseType.CONDO);
        builder.setPool(true);
    }
}
