package design.patterns.creational.abstractFactoryMethod.win;

import design.patterns.creational.abstractFactoryMethod.model.Button;

public class WinButton implements Button {

    @Override
    public void paint() {
        System.out.println("Painting windows button...");
    }
}
