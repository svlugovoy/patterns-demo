package com.svlugovoy.patterns.creational.builder.house_example;

public class House {
    private String walls;
    private String doors;
    private String windows;
    private String roof;

    public House(String walls, String doors, String windows, String roof) {
        this.walls = walls;
        this.doors = doors;
        this.windows = windows;
        this.roof = roof;
    }

    @Override
    public String toString() {
        return "House{" +
                "walls='" + walls + '\'' +
                ", doors='" + doors + '\'' +
                ", windows='" + windows + '\'' +
                ", roof='" + roof + '\'' +
                '}';
    }
}
