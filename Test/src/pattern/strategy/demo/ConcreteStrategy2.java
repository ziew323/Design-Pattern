package pattern.strategy.demo;

public class ConcreteStrategy2 implements Strategy {

    @Override
    public void doSomething() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[1];
        System.out.println(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName());
    }

}
