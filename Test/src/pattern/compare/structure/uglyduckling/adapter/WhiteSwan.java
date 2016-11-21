package pattern.compare.structure.uglyduckling.adapter;

public class WhiteSwan implements Swan {

    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void cry() {
        System.out.println("swan cry");
    }

    @Override
    public void desAppearance() {
        System.out.println("look white");
    }

}
