/*
 * Copyright (c)  2021 Kuchkarov Ahrorbek.
 * All rights reserved
 */

package design.patterns.stuctural.decorator.lib;

public class NotifierImpl implements Notifier {
    @Override
    public void sendMessage() {
        System.out.println("Notify from library..");
    }
}
