package pattern.compare.structure.uglyduckling.decorator;

public class UglyDuckling implements Swan {

    @Override
    public void fly() {
        System.out.println("cannot fly");
    }

    @Override
    public void cry() {
        System.out.println("cry");
    }

    @Override
    public void desAppearance() {
        System.out.println("look dirty");
    }
}
