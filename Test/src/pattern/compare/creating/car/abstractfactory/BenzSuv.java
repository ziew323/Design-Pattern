package pattern.compare.creating.car.abstractfactory;

public class BenzSuv extends AbsBenz {
    private final static String G_SERIES = "G series suv";

    @Override
    public String getModel() {
        return G_SERIES;
    }

}
