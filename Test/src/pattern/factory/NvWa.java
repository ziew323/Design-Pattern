package pattern.factory;

public class NvWa {

    public static void main(String[] args) {
        AbstractHumanFactory yinYanglu = new HumanFactory();

        System.out.println("������");
        Human whiteHuman = yinYanglu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        System.out.println("������");
        Human yellowHuman = yinYanglu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();

        System.out.println("������");
        Human blackHuman = yinYanglu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
    }

}
