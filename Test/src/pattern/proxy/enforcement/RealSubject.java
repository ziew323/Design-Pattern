package pattern.proxy.enforcement;

public class RealSubject implements Subject {

    private Subject proxy = null;

    @Override
    public void request() {
        if (this.isProxy()) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[1];
            System.out.println(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName());
        } else {
            System.out.println("NotProxyError");
        }
    }

    @Override
    public Subject getProxy() {
        this.proxy = new Proxy(this);
        return this.proxy;
    }

    private boolean isProxy() {
        return this.proxy == null ? false : true;
    }

}
