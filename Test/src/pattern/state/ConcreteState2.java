package pattern.state;

/**
 * Created by DARE2DREAM on 2016/11/20 0020.
 */
public class ConcreteState2 extends State {
    @Override
    public void handle1(){
        super.context.setCurrentState(Context.STATE1);
        super.context.handle1();
    }

    @Override
    public void handle2(){
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[1];
        System.out.println(stackTraceElement.getClassName()+"."+stackTraceElement.getMethodName());
    }
}
