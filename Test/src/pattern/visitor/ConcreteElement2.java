package pattern.visitor;

/**
 * Created by DARE2DREAM on 2016/11/20 0020.
 */
public class ConcreteElement2 extends Element {
    public void doSomething(){
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[1];
        System.out.println(stackTraceElement.getClassName()+"."+stackTraceElement.getMethodName());
    }

    public void accept(IVisitor visitor){
        visitor.visit(this);
    }
}
