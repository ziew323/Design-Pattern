package pattern.compare.cross.salary.mediator;

public abstract class AbsMediator {
    protected final ISalary salary;

    protected final IPosition position;

    protected final ITax tax;

    public AbsMediator() {
        salary = new Salary(this);
        position = new Position(this);
        tax = new Tax(this);
    }

    public abstract void down(ISalary salary);

    public abstract void up(ISalary salary);

    public abstract void down(ITax tax);

    public abstract void up(ITax tax);

    public abstract void down(IPosition position);

    public abstract void up(IPosition position);

}
