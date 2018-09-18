package com.svlugovoy.patterns.creational.builder.house_example;

public class Demo {

    public static void main(String[] args) {

        Director director = new Director();

        BuilderWithWood builderWithWood = new BuilderWithWood();
        BuilderWithStone builderWithStone = new BuilderWithStone();

        director.constructWoodHouse(builderWithWood);
        House woodHouse = builderWithWood.getResult();

        director.constructStoneHouse(builderWithStone);
        House stoneHouse = builderWithStone.getResult();

        System.out.println(woodHouse);
        System.out.println(stoneHouse);
    }
}
