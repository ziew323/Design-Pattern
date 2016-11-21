package pattern.composite;

/**
 * Created by DARE2DREAM on 2016/11/20 0020.
 */
public abstract class Component {
    public void doSomething(){
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[1];
        System.out.println(stackTraceElement.getClassName()+"."+stackTraceElement.getMethodName());
    }
}
