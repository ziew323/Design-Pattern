package pattern.proxy;

public class Proxy implements Subject {

    private Subject subject = null;

    public Proxy() {
        this.subject = new RealSubject();
    }

    public Proxy(Subject _subject) {
        this.subject = _subject;
    }

    public Proxy(Object... objects) {

    }

    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    private void after() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[1];
        System.out.println(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName());
    }

    private void before() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[1];
        System.out.println(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName());
    }

}
