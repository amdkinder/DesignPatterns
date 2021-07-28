package design.patterns.creational.factoryMethod;

public class CreatorProductB extends Creator{
    @Override
    Product createProduct() {
        return new ProductB();
    }
}
