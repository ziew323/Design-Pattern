package pattern.compare.wrapping.star.bridge;

public class Singer extends AbsStar {

    public Singer() {
        super(new Sing());
    }

    public Singer(AbsAction action) {
        super(action);
    }

    @Override
    public void doJob() {
        System.out.println("The singer's job");
        super.doJob();
    }

}
