package pattern.factorymethod;

public class NvWa {

    public static void main(String[] args) {
        AbstractHumanFactory yinYanglu = new HumanFactory();

        System.out.println("白种人");
        Human whiteHuman = yinYanglu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        System.out.println("黄种人");
        Human yellowHuman = yinYanglu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();

        System.out.println("黑种人");
        Human blackHuman = yinYanglu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
    }

}
