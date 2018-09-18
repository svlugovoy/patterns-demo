package com.svlugovoy.patterns.creational.builder.car_example;

import com.svlugovoy.patterns.creational.builder.car_example.components.Engine;
import com.svlugovoy.patterns.creational.builder.car_example.components.GPSNavigator;
import com.svlugovoy.patterns.creational.builder.car_example.components.Transmission;
import com.svlugovoy.patterns.creational.builder.car_example.components.TripComputer;
import com.svlugovoy.patterns.creational.builder.car_example.products.Manual;
import com.svlugovoy.patterns.creational.builder.car_example.products.Type;

/**
 * В отличие от других создающих паттернов, Строители могут создавать совершенно
 * разные продукты, не имеющие общего интерфейса.
 *
 * В данном случае мы производим руководство пользователя автомобиля с помощью
 * тех же шагов, что и сами автомобили. Это устройство позволит создавать
 * руководства под конкретные модели автомобилей, содержащие те или иные фичи.
 */
public class CarManualBuilder implements Builder{
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

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
