package pattern.compare.creating.car.abstractfactory;

public abstract class AbsBMW implements ICar {
    private final static String BMW_BAND = "bmw car";

    @Override
    public String getBand() {
        return BMW_BAND;
    }

    @Override
    public abstract String getModel();

}
