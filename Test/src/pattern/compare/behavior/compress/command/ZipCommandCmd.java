package pattern.compare.behavior.compress.command;

public class ZipCommandCmd extends AbstractCmd {

    @Override
    public boolean execute(String source, String to) {
        return super.zip.compress(source, to);
    }

}
