package pattern.compare.behavior.compress.strategy;

public class Client {
    public static void main(String[] args) {
        Context context;
        context = new Context(new Zip());
        context = new Context(new Gzip());
        context.compress("c:\\windows", "d:\\windows.zip");
        context.uncompress("c:\\windows", "d:\\windows.zip");
    }
}
