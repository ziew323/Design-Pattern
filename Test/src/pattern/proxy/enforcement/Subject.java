package pattern.proxy.enforcement;

public interface Subject {
    public void request();

    public Subject getProxy();
}
