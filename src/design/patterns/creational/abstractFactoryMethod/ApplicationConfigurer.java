/*
 * Copyright (c)  2021 Kuchkarov Ahrorbek.
 * All rights reserved
 */

package design.patterns.creational.abstractFactoryMethod;

import design.patterns.creational.abstractFactoryMethod.factory.GUIFactory;
import design.patterns.creational.abstractFactoryMethod.factory.MacFactory;
import design.patterns.creational.abstractFactoryMethod.factory.WinFactory;

import java.util.Random;

public class ApplicationConfigurer {

    public static GUIFactory guiFactory;

    static void initialize() {
        Random random = new Random();
        int n = random.nextInt(2);
        System.out.println("N: " + n);
        if (n % 2 == 0) {
            guiFactory = new WinFactory();
        } else {
            guiFactory = new MacFactory();
        }
    }

    public static void main(String[] args) {
        initialize();
        Application application = new Application(guiFactory);
        application.paint();
    }
}
