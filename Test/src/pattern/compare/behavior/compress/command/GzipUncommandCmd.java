package pattern.compare.behavior.compress.command;

public class GzipUncommandCmd extends AbstractCmd {

    @Override
    public boolean execute(String source, String to) {
        return super.gzip.uncompress(source, to);
    }

}
