package pattern.mediator;

public class ConcreteMediator extends Mediator {

    @Override
    public void doSomething12() {
        super.c1.selfMethod1();
        super.c2.selfMethod1();
    }

    @Override
    public void doSomething13() {
        super.c1.selfMethod1();
        super.c3.selfMethod1();
    }

    @Override
    public void doSomething23() {
        super.c2.selfMethod1();
        super.c3.selfMethod1();
    }

    @Override
    public void doSomething123() {
        super.c1.selfMethod1();
        super.c2.selfMethod1();
        super.c3.selfMethod1();
    }

}
