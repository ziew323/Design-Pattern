package pattern.compare.creating.superman.builder;

public class AdultSuperManBuilder extends Builder {

    @Override
    public SuperMan getSuperMan() {
        super.setBody("strong body");
        super.setSpecialTalent("fly");
        super.setSpecialSymbol("chest with S");
        return super.superMan;
    }

}
