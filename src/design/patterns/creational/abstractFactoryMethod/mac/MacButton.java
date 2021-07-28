package design.patterns.creational.abstractFactoryMethod.mac;

import design.patterns.creational.abstractFactoryMethod.model.Button;

public class MacButton implements Button {

    @Override
    public void paint() {
        System.out.println("Painting mac button...");
    }
}
