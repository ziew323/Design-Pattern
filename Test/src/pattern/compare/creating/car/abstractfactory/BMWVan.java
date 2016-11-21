package pattern.compare.creating.car.abstractfactory;

public class BMWVan extends AbsBMW {
    private final static String SEVENT_SERIES = "7 series van";

    @Override
    public String getModel() {
        return SEVENT_SERIES;
    }

}
