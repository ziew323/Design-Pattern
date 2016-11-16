package pattern.abstractfactory;

public class NvWa {

    public static void main(String[] args) {
        HumanFactory maleHumanFactory = new MaleFactory();
        HumanFactory femaleHumanFactory = new FemaleFactory();

        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();

        maleYellowHuman.getColor();
        maleYellowHuman.getSex();

        femaleYellowHuman.getColor();
        femaleYellowHuman.getSex();

    }

}
