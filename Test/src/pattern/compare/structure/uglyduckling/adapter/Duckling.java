package pattern.compare.structure.uglyduckling.adapter;

public class Duckling implements Duck {

    @Override
    public void cry() {
        System.out.println("duck cry");
    }

    @Override
    public void desAppearance() {
        System.out.println("look yellow");
    }

    @Override
    public void desBehavior() {
        System.out.println("swim");
    }

}
