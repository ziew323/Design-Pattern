package pattern.compare.creating.car.abstractfactory;

public class Client {
    public static void main(String[] args) {
        CarFactory carFactory = new BenzFactory();
        ICar benzSuv = carFactory.createSuv();
        System.out.println("band:" + benzSuv.getBand());
        System.out.println("model:" + benzSuv.getModel());
    }
}
