package pattern.compare.creating.car.builder;

public class Car implements ICar {
    private String engine;

    private String wheel;

    public Car(String engine, String wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    @Override
    public String getWheel() {
        return engine;
    }

    @Override
    public String getEngine() {
        return wheel;
    }

    public String toString() {
        return "wheel:" + wheel + "\nengine:" + engine;
    }

}
