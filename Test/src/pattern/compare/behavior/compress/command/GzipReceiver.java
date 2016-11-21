package pattern.compare.behavior.compress.command;

public class GzipReceiver implements IReceiver {

    @Override
    public boolean compress(String source, String to) {
        System.out.println(source + " --> " + to + " gzip compress success");
        return true;
    }

    @Override
    public boolean uncompress(String source, String to) {
        System.out.println(source + " --> " + to + " gzip uncompress success");
        return true;
    }

}
