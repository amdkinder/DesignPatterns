/*
 * Copyright (c)  2021 Kuchkarov Ahrorbek.
 * All rights reserved
 */

package design.patterns.stuctural.decorator;

import design.patterns.stuctural.decorator.customNotifiers.FacebookNotifier;
import design.patterns.stuctural.decorator.customNotifiers.SmsNotifier;
import design.patterns.stuctural.decorator.decorator.NotifierDecorator;
import design.patterns.stuctural.decorator.lib.Notifier;
import design.patterns.stuctural.decorator.lib.NotifierImpl;

public class Application {
    public static void main(String[] args) {

        Notifier notifier = new NotifierDecorator(new NotifierImpl());
        notifier.sendMessage();
        notifier = new NotifierDecorator(new FacebookNotifier());
        notifier.sendMessage();
        notifier = new NotifierDecorator(new SmsNotifier());
        notifier.sendMessage();
    }
}
