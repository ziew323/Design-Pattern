package pattern.facade;

/**
 * Created by DARE2DREAM on 2016/11/20 0020.
 */
public class ClassA {
    public void doSomethingA(){
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[1];
        System.out.println(stackTraceElement.getClassName()+"."+stackTraceElement.getMethodName());
    }
}
