package pattern.visitor;

/**
 * Created by DARE2DREAM on 2016/11/20 0020.
 */
public class Visitor implements IVisitor {
    public void visit(Element el){
        el.doSomething();
    }
}
