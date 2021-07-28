/*
 * Copyright (c)  2021 Kuchkarov Ahrorbek.
 * All rights reserved
 */

package design.patterns.creational.builder.builder;

import design.patterns.creational.builder.model.Car;

/**
 *
 */
public class CarBuilder implements Builder {

    private Car car;

    public CarBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int n) {
        this.car.setSeat(n);
    }

    @Override
    public void setEngine(String engine) {
        this.car.setEngine(engine);
    }

    @Override
    public void setTripComputer() {
        this.car.setTripComputer(true);
    }

    @Override
    public void setGPS() {
        this.car.setGps(true);
    }

    public Car getResult() {
        return this.car;
    }
}

