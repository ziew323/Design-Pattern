package pattern.compare.structure.uglyduckling.decorator;

public class Decorator implements Swan {
    private Swan swan;

    public Decorator(Swan swan) {
        this.swan = swan;
    }

    @Override
    public void fly() {
        swan.fly();
    }

    @Override
    public void cry() {
        swan.cry();
    }

    @Override
    public void desAppearance() {
        swan.desAppearance();
    }

}
