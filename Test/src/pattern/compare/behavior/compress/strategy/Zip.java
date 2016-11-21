package pattern.compare.behavior.compress.strategy;

public class Zip implements Algorithm {

    @Override
    public boolean compress(String source, String to) {
        System.out.println(source + " --> " + to + " zip compress success");
        return true;
    }

    @Override
    public boolean uncompress(String source, String to) {
        System.out.println(source + " --> " + to + " zip uncompress success");
        return false;
    }

}
