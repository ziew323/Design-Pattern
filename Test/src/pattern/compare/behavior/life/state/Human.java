package pattern.compare.behavior.life.state;

public class Human {
    public static final HumanState CHILD_STATE = new ChildState();

    public static final HumanState ADULT_STATE = new AdultState();

    public static final HumanState OLD_STATE = new OldState();

    private HumanState state;

    public void setState(HumanState state) {
        this.state = state;
        this.state.setHuman(this);
    }

    public void work() {
        this.state.work();
    }
}
