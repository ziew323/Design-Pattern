package pattern.compare.behavior.life.strategy;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setWork(new ChildWork());
        context.work();
        context.setWork(new AdultWork());
        context.work();
        context.setWork(new OldWork());
        context.work();
    }
}
