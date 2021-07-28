package design.patterns.creational.factoryMethod;

public class ProductB implements Product {
    @Override
    public void doStuff() {
        System.out.println("Do stuff from Product A");
    }
}
