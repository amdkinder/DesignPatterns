package design.patterns.creational.abstractFactoryMethod.win;

import design.patterns.creational.abstractFactoryMethod.model.Checkbox;

public class WinCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Painting windows checkbox...");
    }

}
