package pattern.compare.wrapping.star.proxy;

public class Agent implements IStar {

    private IStar star;

    public Agent(IStar star) {
        this.star = star;
    }

    @Override
    public void sign() {
        star.sign();
    }

}
