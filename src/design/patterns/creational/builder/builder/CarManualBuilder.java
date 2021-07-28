/*
 * Copyright (c)  2021 Kuchkarov Ahrorbek.
 * All rights reserved
 */

package design.patterns.creational.builder.builder;

import design.patterns.creational.builder.builder.Builder;
import design.patterns.creational.builder.model.Manual;

/**
 *
 */
public class CarManualBuilder implements Builder {

    private Manual manual;

    public CarManualBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int n) {
        this.manual.setSeat(n);
    }

    @Override
    public void setEngine(String engine) {
        this.manual.setEngine(engine);
    }

    @Override
    public void setTripComputer() {
        this.manual.setTripComputer(true);
    }

    @Override
    public void setGPS() {
        this.manual.setGps(true);
    }

    public Manual getResult() {
        return this.manual;
    }
}
