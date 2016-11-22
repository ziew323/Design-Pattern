package pattern.factorymethod;

public class WhiteHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("白种人皮肤是白的");
    }

    @Override
    public void talk() {
        System.out.println("白种人说话！");
    }

}
