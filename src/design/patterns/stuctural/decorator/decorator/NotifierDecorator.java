/*
 * Copyright (c)  2021 Kuchkarov Ahrorbek.
 * All rights reserved
 */

package design.patterns.stuctural.decorator.decorator;

import design.patterns.stuctural.decorator.lib.Notifier;

public class NotifierDecorator implements Notifier {
    private Notifier wrappee;

    public NotifierDecorator(Notifier wrappee) {
        this.wrappee = wrappee;
    }


    @Override
    public void sendMessage() {
        this.wrappee.sendMessage();
    }
}
