package pattern.command;

public abstract class Command {

    protected final Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}
