package pattern.abstractfactory.demo;

public class Creator2 implements ICreator {

    @Override
    public IProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public IProductB createProductB() {
        return new ProductB2();
    }

}
