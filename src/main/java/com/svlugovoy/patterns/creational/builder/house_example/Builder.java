package com.svlugovoy.patterns.creational.builder.house_example;

public interface Builder {

    void setWalls(String walls);

    void setDoors(String doors);

    void setWindows(String windows);

    void setRoof(String roof);

    House getResult();

}
