package pattern.compare.structure.uglyduckling.adapter;

public class UglyDuckling extends WhiteSwan implements Duck {

    public void cry() {
        super.cry();
    }

    public void desAppearance() {
        super.desAppearance();
    };

    @Override
    public void desBehavior() {
        System.out.println("swim");
        super.fly();
    }

}
