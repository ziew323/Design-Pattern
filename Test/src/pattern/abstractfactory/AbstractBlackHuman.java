package pattern.abstractfactory;

public abstract class AbstractBlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑种人");
    }
}
