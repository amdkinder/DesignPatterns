package design.patterns.creational.abstractFactoryMethod.factory;

import design.patterns.creational.abstractFactoryMethod.mac.MacButton;
import design.patterns.creational.abstractFactoryMethod.mac.MacCheckbox;
import design.patterns.creational.abstractFactoryMethod.model.Button;
import design.patterns.creational.abstractFactoryMethod.model.Checkbox;

public class MacFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
