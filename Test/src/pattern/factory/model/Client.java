package pattern.factory.model;

public class Client {

    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct.class);
        product.method();
    }

}
