/*
 * Copyright (c)  2021 Kuchkarov Ahrorbek.
 * All rights reserved
 */

package design.patterns.creational.abstractFactoryMethod;

import design.patterns.creational.abstractFactoryMethod.factory.GUIFactory;
import design.patterns.creational.abstractFactoryMethod.model.Button;
import design.patterns.creational.abstractFactoryMethod.model.Checkbox;

public class Application {

    private GUIFactory guiFactory;
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory guiFactory) {
        this.guiFactory = guiFactory;
        this.createUI();
    }

    private void createUI() {
        button = guiFactory.createButton();
        checkbox = guiFactory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

}
