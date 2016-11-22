package pattern.compare.cross.salary.mediator;

public class Position extends AbsColleague implements IPosition {

    public Position(AbsMediator mediator) {
        super(mediator);
    }

    @Override
    public void promote() {
        super.mediator.up(this);
    }

    @Override
    public void demote() {
        super.mediator.down(this);
    }

}
