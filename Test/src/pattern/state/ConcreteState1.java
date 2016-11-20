package pattern.state;

/**
 * Created by DARE2DREAM on 2016/11/20 0020.
 */
public class ConcreteState1 extends State {
    @Override
    public void handle1() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[1];
        System.out.println(stackTraceElement.getClassName()+"."+stackTraceElement.getMethodName());
    }

    @Override
    public void handle2() {
        super.context.setCurrentState(Context.STATE2);
        super.context.handle2();
    }
}
