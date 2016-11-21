package pattern.observer.demo;

/**
 * Created by DARE2DREAM on 2016/11/20 0020.
 */
public class ConcreteSubject extends Subject {
    public void doSomething(){
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[1];
        System.out.println(stackTraceElement.getClassName()+"."+stackTraceElement.getMethodName());
        super.notifyObservers();
    }
}
