package pattern.facade;

/**
 * Created by DARE2DREAM on 2016/11/20 0020.
 */
public class ClassB {
    public void doSomethingB(){
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[1];
        System.out.println(stackTraceElement.getClassName()+"."+stackTraceElement.getMethodName());
    }
}
