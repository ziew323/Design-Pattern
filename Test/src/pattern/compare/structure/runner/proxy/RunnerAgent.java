package pattern.compare.structure.runner.proxy;

import java.util.Random;

import pattern.compare.structure.runner.IRunner;

public class RunnerAgent implements IRunner {
    private IRunner runner;

    public RunnerAgent(IRunner runner) {
        this.runner = runner;
    }

    @Override
    public void run() {
        Random rand = new Random();
        if (rand.nextBoolean()) {
            System.out.println("agent agree runner to run");
            runner.run();
        } else {
            System.out.println("agent does not agree runner to run");
        }
    }

}
