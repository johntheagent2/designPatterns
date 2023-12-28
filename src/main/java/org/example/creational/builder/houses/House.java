package org.example.creational.builder.houses;

import org.example.creational.builder.components.Door;
import org.example.creational.builder.components.HouseType;

public class House {
    private final HouseType houseType;
    private Door door;
    private final boolean isPoolExist;

    public House(HouseType houseType, Door door, boolean isPoolExist) {
        this.houseType = houseType;
        this.door = door;
        if(this.door != null){
            this.door.setHouse(this);
        }
        this.isPoolExist = isPoolExist;
    }

    public HouseType getHouseType() {
        return houseType;
    }

    public Door getDoor() {
        return door;
    }

    public boolean isPoolExist() {
        return isPoolExist;
    }
}
