/*
 * Copyright (c)  2021 Kuchkarov Ahrorbek.
 * All rights reserved
 */

package design.patterns.creational.builder.builder;

public class Director {

    public void createSportCard(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("Sport Engine");
        builder.setGPS();
        builder.setTripComputer();
    }
}
