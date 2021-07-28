package design.patterns.creational.abstractFactoryMethod.factory;

import design.patterns.creational.abstractFactoryMethod.model.Button;
import design.patterns.creational.abstractFactoryMethod.model.Checkbox;

public interface GUIFactory {

    Button createButton();

    Checkbox createCheckbox();
}
