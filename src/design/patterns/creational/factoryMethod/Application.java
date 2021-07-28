package design.patterns.creational.factoryMethod;

import design.patterns.creational.factoryMethod.factory.Dialog;
import design.patterns.creational.factoryMethod.factory.MacDialog;
import design.patterns.creational.factoryMethod.factory.WinDialog;

import java.util.Random;

public class Application {
    public static Dialog dialog;

    static void initializeApp() {
        System.out.println("App is running...");
        Random random = new Random();
        int n = random.nextInt(2);
        System.out.println("n: " + n);
        if (n % 2 == 0) {
            dialog = new MacDialog();
        } else {
            dialog = new WinDialog();
        }
    }

    public static void main(String[] args) {
        initializeApp();
        dialog.render();
    }
}
