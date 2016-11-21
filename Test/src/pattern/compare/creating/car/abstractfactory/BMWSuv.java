package pattern.compare.creating.car.abstractfactory;

public class BMWSuv extends AbsBMW {
    private final static String X_SERIES = "X series suv";

    @Override
    public String getModel() {
        return X_SERIES;
    }

}
