package org.example.creational.builder.houses;

import org.example.creational.builder.components.Door;
import org.example.creational.builder.components.HouseType;

public class HouseManual {
    private final HouseType houseType;
    private final Door door;
    private final boolean isPoolExist;

    public HouseManual(HouseType houseType, Door door, boolean isPoolExist) {
        this.houseType = houseType;
        this.door = door;
        this.isPoolExist = isPoolExist;
    }

    public String print() {
        int doorNum = 0;
        String doorWoodType = "N/A";
        if(this.door != null)
        {
            doorNum = this.door.getNumOfDoor();
            doorWoodType = String.valueOf(this.door.getTypeOfWood());
        }
        return "CustomHouse{" +
                "houseType=" + houseType +
                ", doorNum=" + doorNum +
                ", doorWoodType=" + doorWoodType +
                ", isPoolExist=" + isPoolExist +
                '}';
    }
}
