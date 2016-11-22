package pattern.abstractfactory;

public class MaleWhiteHuman extends AbstractYellowHuman {

    @Override
    public void getSex() {
        System.out.println("白种人男性");
    }

}
