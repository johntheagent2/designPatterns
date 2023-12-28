package org.example.creational.builder.builders;

import org.example.creational.builder.components.Door;
import org.example.creational.builder.components.HouseType;
import org.example.creational.builder.houses.House;

public class HouseBuilder implements Builder{
    private HouseType houseType;
    private Door door;
    private boolean isPoolExist;

    public HouseBuilder() {
    }

    @Override
    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }

    @Override
    public void setDoor(Door door) {
        this.door = door;
    }

    @Override
    public void setPool(boolean isExist) {
        this.isPoolExist = isExist;
    }

    public House getResult(){
        return new House(houseType, door, isPoolExist);
    }
}
