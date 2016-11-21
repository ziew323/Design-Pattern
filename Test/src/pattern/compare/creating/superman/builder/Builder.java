package pattern.compare.creating.superman.builder;

public abstract class Builder {
    protected final SuperMan superMan = new SuperMan();

    public void setBody(String body) {
        this.superMan.setBody(body);
    }

    public void setSpecialTalent(String specialTalent) {
        this.superMan.setSpecialTalent(specialTalent);
    }

    public void setSpecialSymbol(String specialSymbol) {
        this.superMan.setSpecialSymbol(specialSymbol);
    }

    public abstract SuperMan getSuperMan();
}
