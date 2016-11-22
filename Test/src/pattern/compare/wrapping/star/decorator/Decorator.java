package pattern.compare.wrapping.star.decorator;

public abstract class Decorator implements IStar {

    private IStar star;

    public Decorator(IStar star) {
        this.star = star;
    }

    @Override
    public void act() {
        this.star.act();
    }

}
