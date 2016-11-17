package pattern.builder;

public class ConcreteBuilder1 extends Builder {

    private Product product = new Product();

    @Override
    public void setPart() {
        product.setName("name1");
    }

    @Override
    public Product buildProduct() {
        return product;
    }

}
