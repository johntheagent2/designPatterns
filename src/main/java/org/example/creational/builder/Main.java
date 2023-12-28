package org.example.creational.builder;

import org.example.creational.builder.builders.HouseBuilder;
import org.example.creational.builder.builders.HouseManualBuilder;
import org.example.creational.builder.director.Director;
import org.example.creational.builder.houses.House;
import org.example.creational.builder.houses.HouseManual;

public class Main {
    public static void main(String[] args){
        Director director = new Director();

        //build house
        HouseBuilder houseBuilder = new HouseBuilder();
        director.constructBungalow(houseBuilder);

        House house = houseBuilder.getResult();
        System.out.println(house.getHouseType());

        //build a manual
        HouseManualBuilder manualBuilder = new HouseManualBuilder();
        director.constructPenHouse(manualBuilder);

        HouseManual houseManual = manualBuilder.getResult();
        System.out.println(houseManual.print());
    }
}
