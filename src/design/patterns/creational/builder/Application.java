/*
 * Copyright (c)  2021 Kuchkarov Ahrorbek.
 * All rights reserved
 */

package design.patterns.creational.builder;

import design.patterns.creational.builder.builder.CarBuilder;
import design.patterns.creational.builder.builder.CarManualBuilder;
import design.patterns.creational.builder.builder.Director;
import design.patterns.creational.builder.model.Car;
import design.patterns.creational.builder.model.Manual;

public class Application {

    public static void makeCar() {

        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.createSportCard(carBuilder);
        Car car = carBuilder.getResult();

        System.out.println(car.toString());

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.createSportCard(carManualBuilder);
        Manual manual = carManualBuilder.getResult();
        System.out.println(manual);
    }

    public static void main(String[] args) {
        System.out.println("Application is running...");
        makeCar();
    }
}
