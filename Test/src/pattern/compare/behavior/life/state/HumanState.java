package pattern.compare.behavior.life.state;

public abstract class HumanState {
    protected Human human;

    public void setHuman(Human human) {
        this.human = human;
    }

    public abstract void work();
}
