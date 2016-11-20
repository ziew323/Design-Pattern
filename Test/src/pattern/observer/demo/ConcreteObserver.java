package pattern.observer.demo;

/**
 * Created by DARE2DREAM on 2016/11/20 0020.
 */
public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("接收到信息，并进行处理！");
    }
}
