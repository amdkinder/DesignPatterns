/*
 * Copyright (c)  2021 Kuchkarov Ahrorbek.
 * All rights reserved
 */

package design.patterns.creational.prototype.model;

public class Rectangle extends Shape {

    public Rectangle() {
    }

    public Rectangle(Rectangle source) {
        super(source);
        this.width = source.width;
        this.height = source.height;
    }

    public int width;

    public int height;

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}
