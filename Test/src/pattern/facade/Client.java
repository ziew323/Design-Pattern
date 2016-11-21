package pattern.facade;

/**
 * Created by DARE2DREAM on 2016/11/20 0020.
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
        facade.methodC();
    }
}
