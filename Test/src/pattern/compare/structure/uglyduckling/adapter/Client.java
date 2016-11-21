package pattern.compare.structure.uglyduckling.adapter;

public class Client {
    public static void main(String[] args) {
        Duck duck = new Duckling();
        duck.cry();
        duck.desAppearance();
        duck.desBehavior();
        Duck uglyDuckling = new UglyDuckling();
        uglyDuckling.cry();
        uglyDuckling.desAppearance();
        uglyDuckling.desBehavior();
    }
}
