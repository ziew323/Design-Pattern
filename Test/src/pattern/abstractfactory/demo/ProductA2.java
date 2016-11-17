package pattern.abstractfactory.demo;

public class ProductA2 extends IProductA {

    @Override
    public void doSomething() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[1];
        System.out.println(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName());
    }

}
