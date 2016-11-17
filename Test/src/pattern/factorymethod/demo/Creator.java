package pattern.factorymethod.demo;

public class Creator implements ICreator {

    @Override
    public <T extends IProduct> T createProduct(Class<T> c) {
        IProduct product = null;
        try {
            product = (IProduct) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }

}
