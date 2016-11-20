package pattern.visitor.demo;

/**
 * Created by DARE2DREAM on 2016/11/20 0020.
 */
public class Client {
    public static void main(String[] args) {
        AbsActor actor = new OldActor();
        Role role = new KungFuRole();
        role.accept(actor);
        actor.act(role);
    }
}
