/*
 * Copyright (c)  2021 Kuchkarov Ahrorbek.
 * All rights reserved
 */

package design.patterns.creational.builder.builder;

/**
 *
 */
public interface Builder {

    void reset();

    void setSeats(int n);

    void setEngine(String engine);

    void setTripComputer();

    void setGPS();

}
