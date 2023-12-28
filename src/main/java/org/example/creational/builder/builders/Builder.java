package org.example.creational.builder.builders;

import org.example.creational.builder.components.Door;
import org.example.creational.builder.components.HouseType;

public interface Builder {
    void setHouseType(HouseType houseType);
    void setDoor(Door door);
    void setPool(boolean isExist);
}
