package pattern.compare.behavior.compress.command.simple;

public class AddCmd extends AbstractCmd {

    @Override
    public int execute(int a, int b) {
        return a + b;
    }

}
