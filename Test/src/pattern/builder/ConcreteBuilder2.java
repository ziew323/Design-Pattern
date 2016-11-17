package pattern.builder;

public class ConcreteBuilder2 extends Builder {

    private Product product = new Product();

    @Override
    public void setPart() {
        product.setName("name2");
    }

    @Override
    public Product buildProduct() {
        return product;
    }

}
