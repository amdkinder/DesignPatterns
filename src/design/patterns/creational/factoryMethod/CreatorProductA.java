package design.patterns.creational.factoryMethod;

public class CreatorProductA extends Creator{
    @Override
    Product createProduct() {
        return new ProductA();
    }
}
