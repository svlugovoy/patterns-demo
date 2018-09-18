package com.svlugovoy.patterns.creational.builder.car_example;

import com.svlugovoy.patterns.creational.builder.car_example.components.Engine;
import com.svlugovoy.patterns.creational.builder.car_example.components.GPSNavigator;
import com.svlugovoy.patterns.creational.builder.car_example.components.Transmission;
import com.svlugovoy.patterns.creational.builder.car_example.components.TripComputer;
import com.svlugovoy.patterns.creational.builder.car_example.products.Type;

/**
 * Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации
 * продукта.
 */
public interface Builder {
    public void setType(Type type);
    public void setSeats(int seats);
    public void setEngine (Engine engine);
    public void setTransmission(Transmission transmission);
    public void setTripComputer(TripComputer tripComputer);
    public void setGPSNavigator(GPSNavigator gpsNavigator);
}
