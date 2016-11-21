package pattern.compare.behavior.compress.strategy;

public class Gzip implements Algorithm {

    @Override
    public boolean compress(String source, String to) {
        System.out.println(source + " --> " + to + " gzip compress success");
        return true;
    }

    @Override
    public boolean uncompress(String source, String to) {
        System.out.println(source + " --> " + to + " gzip uncompress success");
        return false;
    }

}
