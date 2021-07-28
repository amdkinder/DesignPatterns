/*
 * Copyright (c)  2021 Kuchkarov Ahrorbek.
 * All rights reserved
 */

package design.patterns.creational.prototype.model;

/**
 *
 */
public abstract class Shape {

    public int x;
    public int y;
    String color;

    public Shape() {
    }

    public Shape(Shape source) {
        this();
        this.x = source.x;
        this.y = source.y;
        this.color = source.color;
    }

    public abstract Shape clone();
}
