package design.patterns.creational.abstractFactoryMethod.factory;

import design.patterns.creational.abstractFactoryMethod.model.Button;
import design.patterns.creational.abstractFactoryMethod.model.Checkbox;
import design.patterns.creational.abstractFactoryMethod.win.WinButton;
import design.patterns.creational.abstractFactoryMethod.win.WinCheckbox;

public class WinFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
