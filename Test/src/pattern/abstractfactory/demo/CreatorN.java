package pattern.abstractfactory.demo;

public class CreatorN implements ICreator {

    @Override
    public IProductA createProductA() {
        return new ProductAN();
    }

    @Override
    public IProductB createProductB() {
        return new ProductBN();
    }

}
