package org.example.creational.builder.builders;

import org.example.creational.builder.components.Door;
import org.example.creational.builder.components.HouseType;
import org.example.creational.builder.houses.HouseManual;

public class HouseManualBuilder implements Builder{
    private HouseType houseType;
    private Door door;
    private boolean isPoolExist;

    public HouseManualBuilder() {
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

    public HouseManual getResult(){
        return new HouseManual(houseType, door, isPoolExist);
    }
}
