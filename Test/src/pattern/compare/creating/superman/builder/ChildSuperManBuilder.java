package pattern.compare.creating.superman.builder;

public class ChildSuperManBuilder extends Builder {

    @Override
    public SuperMan getSuperMan() {
        super.setBody("strong body");
        super.setSpecialTalent("invulnerability");
        super.setSpecialSymbol("chest with s");
        return super.superMan;
    }

}
