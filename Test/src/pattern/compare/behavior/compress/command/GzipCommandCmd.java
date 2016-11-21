package pattern.compare.behavior.compress.command;

public class GzipCommandCmd extends AbstractCmd {

    @Override
    public boolean execute(String source, String to) {
        return super.gzip.compress(source, to);
    }

}
