package pattern.visitor.demo;

/**
 * Created by DARE2DREAM on 2016/11/20 0020.
 */
public class KungFuRole implements Role {
    @Override
    public void accept(AbsActor actor) {
        actor.act(this);
    }
}
