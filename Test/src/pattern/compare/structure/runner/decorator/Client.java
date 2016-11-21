package pattern.compare.structure.runner.decorator;

import pattern.compare.structure.runner.IRunner;
import pattern.compare.structure.runner.Runner;

public class Client {
    public static void main(String[] args) {
        IRunner liu = new Runner();
        liu = new RunnerWithJet(liu);
        System.out.println("runner with a jet");
        liu.run();
    }
}
