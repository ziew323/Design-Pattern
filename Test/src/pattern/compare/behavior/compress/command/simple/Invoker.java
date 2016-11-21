package pattern.compare.behavior.compress.command.simple;

public class Invoker {
    private AbstractCmd cmd;

    public Invoker(AbstractCmd cmd) {
        this.cmd = cmd;
    }

    public int execute(int a, int b) {
        return cmd.execute(a, b);
    }
}
