/*
 * Copyright (c)  2021 Kuchkarov Ahrorbek.
 * All rights reserved
 */

package design.patterns.creational.prototype;

import design.patterns.creational.prototype.model.Circle;
import design.patterns.creational.prototype.model.Rectangle;
import design.patterns.creational.prototype.model.Shape;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public List<Shape> shapes = new ArrayList<>();

    public Application() {
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 10;
        circle.radius = 20;
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.x = 20;
        rectangle.y = 20;
        rectangle.height = 10;
        rectangle.width = 30;
        shapes.add(rectangle);
    }

    public static void main(String[] args) {

        System.out.println("Application is started...");

        List<Shape> shapeList = new ArrayList<>();
        Application application = new Application();
        for (Shape shape : application.shapes) {
            shapeList.add(shape.clone());
        }
        System.out.println(shapeList);
    }
}
