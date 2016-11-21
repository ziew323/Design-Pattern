package pattern.compare.behavior.compress.strategy.simple;

public class Client {
    public static void main(String[] args) {
        Context context;
        context = new Context(new ConcreteAlgorithm());
        int result = context.add(1, 2);
        System.out.println(result);
    }
}
