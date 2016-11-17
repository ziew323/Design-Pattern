package pattern.abstractfactory.demo;

public class Client {

    public static void main(String[] args) {
        ICreator creator1 = new Creator1();
        ICreator creator2 = new Creator2();
        ICreator creatorN = new CreatorN();

        IProductA a1 = creator1.createProductA();
        IProductA a2 = creator2.createProductA();
        IProductA aN = creatorN.createProductA();

        IProductB b1 = creator1.createProductB();
        IProductB b2 = creator2.createProductB();
        IProductB bN = creatorN.createProductB();

        a1.shareMethod();
        a1.doSomething();

        a2.shareMethod();
        a2.doSomething();

        aN.shareMethod();
        aN.doSomething();

        b1.shareMethod();
        b1.doSomething();

        b2.shareMethod();
        b2.doSomething();

        bN.shareMethod();
        bN.doSomething();
    }

}
