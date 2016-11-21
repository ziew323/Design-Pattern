package pattern.compare.creating.car.abstractfactory;

public abstract class AbsBenz implements ICar {
    private final static String BENZ_BAND = "benz car";

    @Override
    public String getBand() {
        return BENZ_BAND;
    }

    @Override
    public abstract String getModel();

}
