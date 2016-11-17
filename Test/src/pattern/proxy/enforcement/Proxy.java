package pattern.proxy.enforcement;

public class Proxy implements Subject {

    private Subject subject = null;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        subject.request();
    }

    @Override
    public Subject getProxy() {
        return this;
    }

}
