/*
 * Copyright (c)  2021 Kuchkarov Ahrorbek.
 * All rights reserved
 */

package design.patterns.creational.builder.model;

/**
 *
 */
public class Manual {

    public Manual() {
        this.tripComputer = false;
        this.gps = false;
    }

    private int seat;
    private String engine;
    private boolean tripComputer;
    private boolean gps;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public boolean isTripComputer() {
        return tripComputer;
    }

    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Manual{" +
                "seat=" + seat +
                ", engine='" + engine + '\'' +
                ", tripComputer=" + tripComputer +
                ", gps=" + gps +
                '}';
    }
}
