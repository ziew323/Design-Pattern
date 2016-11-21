package pattern.compare.behavior.compress.strategy.simple;

public class ConcreteAlgorithm implements Algorithm {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

}
