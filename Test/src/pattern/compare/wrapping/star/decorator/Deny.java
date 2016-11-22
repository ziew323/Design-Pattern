package pattern.compare.wrapping.star.decorator;

public class Deny extends Decorator {

    public Deny(IStar star) {
        super(star);
    }

    @Override
    public void act() {
        super.act();
        System.out.println("The actor denial");
    }

}
