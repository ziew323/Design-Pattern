package pattern.visitor;

/**
 * Created by DARE2DREAM on 2016/11/20 0020.
 */
public abstract class Element {
    public abstract  void doSomething();
    public abstract  void accept(IVisitor visitor);
}
