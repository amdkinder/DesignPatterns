/*
 * Copyright (c)  2021 Kuchkarov Ahrorbek.
 * All rights reserved
 */

package design.patterns.stuctural.decorator.customNotifiers;

import design.patterns.stuctural.decorator.lib.Notifier;

public class SmsNotifier implements Notifier {
    @Override
    public void sendMessage() {
        System.out.println("Notify from sms..");
    }
}
