package design.patterns.creational.factoryMethod;

public abstract class Creator {
    abstract Product createProduct();
    public void render() {
        Product product = createProduct();
        product.doStuff();
    }
}
