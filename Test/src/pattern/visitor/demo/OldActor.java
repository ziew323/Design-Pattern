package pattern.visitor.demo;

/**
 * Created by DARE2DREAM on 2016/11/20 0020.
 */
public class OldActor extends AbsActor {
    public void act(KungFuRole role) {
        System.out.println("年龄大了，不能演功夫角色");
    }
}
