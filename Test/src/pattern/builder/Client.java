package pattern.builder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        Product product1 = director.getAProduct1();
        product1.doSomething();

        Product product2 = director.getAProduct2();
        product2.doSomething();

    }
}
