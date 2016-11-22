package pattern.factorymethod;

public class YellowHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("黄种人皮肤是黄色！");
    }

    @Override
    public void talk() {
        System.out.println("黄种人说话！");
    }

}
