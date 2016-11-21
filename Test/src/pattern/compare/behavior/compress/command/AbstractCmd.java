package pattern.compare.behavior.compress.command;

public abstract class AbstractCmd {
    protected IReceiver zip = new ZipReceiver();

    protected IReceiver gzip = new GzipReceiver();

    public abstract boolean execute(String source, String to);
}
