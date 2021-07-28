/*
 * Copyright (c)  2021 Kuchkarov Ahrorbek.
 * All rights reserved
 */

package design.patterns.creational.factoryMethod.factory;

import design.patterns.creational.factoryMethod.model.Button;

public abstract class Dialog {

    abstract Button createButton();

    public void render() {
        Button button = createButton();
        button.render();
        String event = "close dialog";
        button.onClick(event);
    }
}
