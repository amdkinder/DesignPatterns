/*
 * Copyright (c)  2021 Kuchkarov Ahrorbek.
 * All rights reserved
 */

package design.patterns.creational.factoryMethod.factory;

import design.patterns.creational.factoryMethod.model.Button;
import design.patterns.creational.factoryMethod.model.WinButton;

public class WinDialog extends Dialog {

    @Override
    Button createButton() {
        return new WinButton();
    }
}
