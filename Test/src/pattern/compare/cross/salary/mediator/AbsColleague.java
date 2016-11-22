package pattern.compare.cross.salary.mediator;

public abstract class AbsColleague {
    protected AbsMediator mediator;

    public AbsColleague(AbsMediator mediator) {
        this.mediator = mediator;
    }
}
