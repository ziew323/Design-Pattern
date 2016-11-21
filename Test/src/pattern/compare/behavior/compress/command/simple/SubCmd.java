package pattern.compare.behavior.compress.command.simple;

public class SubCmd extends AbstractCmd {

    @Override
    public int execute(int a, int b) {
        return a - b;
    }

}
