package com.svlugovoy.patterns.creational.builder.house_example;

public class BuilderWithWood implements Builder {

    private String walls;
    private String doors;
    private String windows;
    private String roof;

    @Override
    public void setWalls(String walls) {
        this.walls = walls;
    }

    @Override
    public void setDoors(String doors) {
        this.doors = doors;
    }

    @Override
    public void setWindows(String windows) {
        this.windows = windows;
    }

    @Override
    public void setRoof(String roof) {
        this.roof = roof;
    }


    @Override
    public House getResult() {
        return new House(walls, doors, windows, roof);
    }
}
