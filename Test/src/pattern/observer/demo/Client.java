package pattern.observer.demo;

/**
 * Created by DARE2DREAM on 2016/11/20 0020.
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        concreteSubject.addObserver(observer);
        concreteSubject.doSomething();

    }
}
