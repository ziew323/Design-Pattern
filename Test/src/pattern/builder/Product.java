package pattern.builder;

public class Product {

    private StringBuffer name = new StringBuffer();

    public void setName(String name) {
        this.name.append(name);
    }

    public void doSomething() {
        System.out.println("name:" + name);
    }
}
