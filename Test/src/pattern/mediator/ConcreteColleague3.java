package pattern.mediator;

public class ConcreteColleague3 extends Colleague {

    public ConcreteColleague3(Mediator mediator) {
        super(mediator);
    }

    public void selfMethod1() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[1];
        System.out.println(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName());

    }

    public void depMethod1() {
        super.mediator.doSomething12();
    }

}
