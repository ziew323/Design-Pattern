package pattern.abstractfactory;

public abstract class AbstractYellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄种人");
    }
}
