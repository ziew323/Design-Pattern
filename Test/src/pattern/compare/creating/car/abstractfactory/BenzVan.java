package pattern.compare.creating.car.abstractfactory;

public class BenzVan extends AbsBenz {
    private final static String R_SERIES = "R series van";

    @Override
    public String getModel() {
        return R_SERIES;
    }

}
