package pattern.compare.wrapping.star.bridge;

public abstract class AbsStar {
    protected final AbsAction action;

    public AbsStar(AbsAction action) {
        this.action = action;
    }

    public void doJob() {
        action.desc();
    }
}
