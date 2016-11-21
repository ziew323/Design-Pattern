package pattern.mediator;

public abstract class Mediator {
    protected ConcreteColleague1 c1;

    protected ConcreteColleague2 c2;

    protected ConcreteColleague3 c3;

    public ConcreteColleague1 getC1() {
        return c1;
    }

    public void setC1(ConcreteColleague1 c1) {
        this.c1 = c1;
    }

    public ConcreteColleague2 getC2() {
        return c2;
    }

    public void setC2(ConcreteColleague2 c2) {
        this.c2 = c2;
    }

    public ConcreteColleague3 getC3() {
        return c3;
    }

    public void setC3(ConcreteColleague3 c3) {
        this.c3 = c3;
    }

    public abstract void doSomething12();

    public abstract void doSomething13();

    public abstract void doSomething23();

    public abstract void doSomething123();
}
