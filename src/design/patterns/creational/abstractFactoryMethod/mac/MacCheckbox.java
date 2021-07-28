package design.patterns.creational.abstractFactoryMethod.mac;

import design.patterns.creational.abstractFactoryMethod.model.Checkbox;

public class MacCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Painting mac checkbox...");
    }
}
