package com.svlugovoy.patterns.creational.builder.car_example.components;

import com.svlugovoy.patterns.creational.builder.car_example.products.Car;

/**
 * Одна из фишек автомобиля.
 */
public class TripComputer {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }
}
