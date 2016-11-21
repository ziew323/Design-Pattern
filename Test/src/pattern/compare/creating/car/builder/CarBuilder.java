package pattern.compare.creating.car.builder;

public abstract class CarBuilder {
    private ICar car;

    private Blueprint bp;

    public Car BuilderCar() {
        return new Car(buildEngine(), buildWheel());
    }

    public void recriveBuleprint(Blueprint bp) {
        this.bp = bp;
    }

    protected Blueprint getBlueprint() {
        return bp;
    }

    protected abstract String buildWheel();

    protected abstract String buildEngine();
}
