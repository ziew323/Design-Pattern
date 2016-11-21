package pattern.compare.behavior.compress.command;

public class Invoker {
    private AbstractCmd cmd;

    public Invoker(AbstractCmd cmd) {
        this.cmd = cmd;
    }

    public boolean execute(String source, String to) {
        return cmd.execute(source, to);
    }
}
