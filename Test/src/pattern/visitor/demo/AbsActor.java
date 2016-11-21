package pattern.visitor.demo;

/**
 * Created by DARE2DREAM on 2016/11/20 0020.
 */
public abstract class AbsActor {
    public void act(Role role) {
        System.out.println("演员可以扮演任何角色");
    }

    public void act(KungFuRole role) {
        System.out.println("演员都可以演功夫角色");
    }
}
