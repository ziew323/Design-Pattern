package pattern.proxy;

public class Client {
    public static void main(String[] args) {
        Subject proxy = new Proxy();
        proxy.request();
    }
}
