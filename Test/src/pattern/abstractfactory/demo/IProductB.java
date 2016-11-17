package pattern.abstractfactory.demo;

public abstract class IProductB implements IProduct {

    @Override
    public void shareMethod() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[1];
        System.out.println(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName());
    }

}