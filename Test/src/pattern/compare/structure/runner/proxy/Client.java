package pattern.compare.structure.runner.proxy;

import pattern.compare.structure.runner.IRunner;
import pattern.compare.structure.runner.Runner;

public class Client {
    public static void main(String[] args) {
        IRunner liu = new Runner();
        IRunner agent = new RunnerAgent(liu);
        agent.run();
    }
}
