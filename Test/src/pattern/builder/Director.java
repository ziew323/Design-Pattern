package pattern.builder;

public class Director {
    private Builder builder1 = new ConcreteBuilder1();

    private Builder builder2 = new ConcreteBuilder2();

    public Product getAProduct1() {
        builder1.setPart();
        return builder1.buildProduct();
    }

    public Product getAProduct2() {
        builder2.setPart();
        return builder2.buildProduct();
    }

}
