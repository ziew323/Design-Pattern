package pattern.abstractfactory.demo;

public class Creator1 implements ICreator {

    @Override
    public IProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public IProductB createProductB() {
        return new ProductB1();
    }

}
