package pattern.compare.creating.car.abstractfactory;

public class BenzFactory implements CarFactory {

    @Override
    public ICar createSuv() {
        return new BenzSuv();
    }

    @Override
    public ICar createVan() {
        return new BenzVan();
    }

}
