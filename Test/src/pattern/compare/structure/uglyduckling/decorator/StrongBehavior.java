package pattern.compare.structure.uglyduckling.decorator;

public class StrongBehavior extends Decorator {

    public StrongBehavior(Swan swan) {
        super(swan);
    }

    public void fly() {
        System.out.println("fly");
    }

}
