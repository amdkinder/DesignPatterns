/*
 * Copyright (c)  2021 Kuchkarov Ahrorbek.
 * All rights reserved
 */

package design.patterns.creational.factoryMethod.model;

public class WinButton implements Button {

    @Override
    public void render() {
        System.out.println("Windows button rendering...");
    }

    @Override
    public void onClick(String event) {
        System.out.println("Windows button clicking: " + event);
    }
}
