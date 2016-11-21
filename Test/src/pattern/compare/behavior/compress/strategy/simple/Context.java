package pattern.compare.behavior.compress.strategy.simple;

public class Context {
    private Algorithm al;

    public Context(Algorithm al) {
        this.al = al;
    }

    public int add(int a, int b) {
        return al.add(a, b);
    }

    public int sub(int a, int b) {
        return al.sub(a, b);
    }
}
