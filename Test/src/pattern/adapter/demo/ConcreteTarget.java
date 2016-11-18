package pattern.adapter.demo;

public class ConcreteTarget implements Target {

    @Override
    public void request() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[1];
        System.out.println(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName());
    }

}
