package pattern.compare.structure.runner.decorator;

import pattern.compare.structure.runner.IRunner;

public class RunnerWithJet implements IRunner {
    private IRunner runner;

    public RunnerWithJet(IRunner runner) {
        this.runner = runner;
    }

    @Override
    public void run() {
        System.out.println("with a jet");
        runner.run();
    }

}
