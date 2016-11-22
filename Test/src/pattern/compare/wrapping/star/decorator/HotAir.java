package pattern.compare.wrapping.star.decorator;

public class HotAir extends Decorator {

    public HotAir(IStar star) {
        super(star);
    }

    @Override
    public void act() {
        System.out.println("Talk the talk");
        super.act();
    }

}
