package pattern.compare.behavior.life.strategy;

public class Context {
    private WorkAlgorithm workMethod;

    public WorkAlgorithm getWork() {
        return workMethod;
    }

    public void setWork(WorkAlgorithm work) {
        this.workMethod = work;
    }

    public void work() {
        workMethod.work();
    }
}
