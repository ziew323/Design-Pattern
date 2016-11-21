package pattern.compare.behavior.compress.command;

public class ZipUncommandCmd extends AbstractCmd {

    @Override
    public boolean execute(String source, String to) {
        return super.zip.uncompress(source, to);
    }

}
