package pattern.factorymethod.demo;

public class ProductN implements IProduct {

    @Override
    public void method() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[1];
        System.out.println(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName());
    }

}
