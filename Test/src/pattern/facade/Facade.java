package pattern.facade;

/**
 * Created by DARE2DREAM on 2016/11/20 0020.
 */
public class Facade {
    private ClassA a = new ClassA();
    private ClassB b = new ClassB();
    private ClassC c = new ClassC();

    public void methodA(){
        this.a.doSomethingA();
    }

    public void methodB(){
        this.b.doSomethingB();
    }

    public void methodC(){
        this.c.doSomethingC();
    }
}
