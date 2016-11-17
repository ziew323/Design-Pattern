package pattern.proxy.enforcement;

public class Client {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Subject proxy = subject.getProxy();
        proxy.request();
    }
}
