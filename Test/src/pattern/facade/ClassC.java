package pattern.facade;

/**
 * Created by DARE2DREAM on 2016/11/20 0020.
 */
public class ClassC {
    public void doSomethingC(){
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[1];
        System.out.println(stackTraceElement.getClassName()+"."+stackTraceElement.getMethodName());
    }
}
