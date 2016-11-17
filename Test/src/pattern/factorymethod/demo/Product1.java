package pattern.factorymethod.demo;

public class Product1 implements IProduct {

    @Override
    public void method() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[1];
        System.out.println(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName());
    }

}
