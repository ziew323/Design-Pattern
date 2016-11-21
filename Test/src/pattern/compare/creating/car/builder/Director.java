package pattern.compare.creating.car.builder;

public class Director {
    private CarBuilder benzBuilder = new BenzBuilder();

    private CarBuilder bmwBuilder = new BMWBuilder();

    public ICar createBenzSuv() {
        return createCar(benzBuilder, "benz engine", "benz wheel");
    }

    public ICar createBMWVan() {
        return createCar(bmwBuilder, "bmw engine", "bmw wheel");
    }

    public ICar createComplexCar() {
        return createCar(bmwBuilder, "bmw engine", "benz wheel");
    }

    private ICar createCar(CarBuilder carBuilder, String engine, String wheel) {
        Blueprint bp = new Blueprint();
        bp.setEngine(engine);
        bp.setWheel(wheel);
        System.out.println("get a blueprint");
        carBuilder.recriveBuleprint(bp);
        return carBuilder.BuilderCar();
    }
}
