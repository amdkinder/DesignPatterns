package design.patterns.creational.factoryMethod;

import java.util.Random;

public class Application {
    public static Creator creator;

    static void initializeApp() {
        System.out.println("App is running...");
        Random random = new Random();
        int n = random.nextInt(2);
        System.out.println("n: " + n);
        if (n % 2 == 0) {
            creator = new CreatorProductA();
        } else {
            creator = new CreatorProductB();
        }
    }

    public static void main(String[] args) {
        initializeApp();
        creator.render();
    }
}
