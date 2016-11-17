package pattern.factorymethod.demo;

public interface ICreator {
    public <T extends IProduct> T createProduct(Class<T> c);
}
