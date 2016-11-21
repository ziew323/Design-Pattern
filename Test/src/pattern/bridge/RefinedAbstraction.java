package pattern.bridge;

public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor imp) {
        super(imp);
    }

    @Override
    public void request() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[1];
        System.out.println(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName());
        super.request();
        super.getImp().doAnything();
    }

}
