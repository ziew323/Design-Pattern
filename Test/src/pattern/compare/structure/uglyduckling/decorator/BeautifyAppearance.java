package pattern.compare.structure.uglyduckling.decorator;

public class BeautifyAppearance extends Decorator {

    public BeautifyAppearance(Swan swan) {
        super(swan);
    }

    @Override
    public void desAppearance() {
        System.out.println("white");
    }
}
