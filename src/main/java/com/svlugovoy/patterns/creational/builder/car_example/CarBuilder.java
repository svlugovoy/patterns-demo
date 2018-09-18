package com.svlugovoy.patterns.creational.builder.car_example;

import com.svlugovoy.patterns.creational.builder.car_example.components.Engine;
import com.svlugovoy.patterns.creational.builder.car_example.components.GPSNavigator;
import com.svlugovoy.patterns.creational.builder.car_example.components.Transmission;
import com.svlugovoy.patterns.creational.builder.car_example.components.TripComputer;
import com.svlugovoy.patterns.creational.builder.car_example.products.Car;
import com.svlugovoy.patterns.creational.builder.car_example.products.Type;

/**
 * Конкретные строители реализуют шаги, объявленные в общем интерфейсе.
 */
public class CarBuilder implements Builder {
    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
