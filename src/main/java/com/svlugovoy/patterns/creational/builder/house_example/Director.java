package com.svlugovoy.patterns.creational.builder.house_example;

public class Director {

    public void constructWoodHouse(Builder builder) {
        builder.setWalls("Wood walls");
        builder.setDoors("Wood doors");
        builder.setWindows("Wood windows");
        builder.setRoof("Wood roof");
    }

    public void constructStoneHouse(Builder builder) {
        builder.setWalls("Stone walls");
        builder.setDoors("Stone doors");
        builder.setWindows("Stone windows");
        builder.setRoof("Stone roof");
    }

}
