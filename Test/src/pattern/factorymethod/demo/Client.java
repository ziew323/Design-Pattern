package pattern.factorymethod.demo;

public class Client {

    public static void main(String[] args) {
        ICreator creator = new Creator();

        IProduct product1 = creator.createProduct(Product1.class);
        product1.method();

        IProduct product2 = creator.createProduct(Product2.class);
        product2.method();

        IProduct productN = creator.createProduct(ProductN.class);
        productN.method();
    }

}
