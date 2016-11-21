package pattern.compare.structure.uglyduckling.decorator;

public class Client {
    public static void main(String[] args) {
        Swan duckling = new UglyDuckling();
        duckling.desAppearance();
        duckling.cry();
        duckling.fly();

        duckling = new BeautifyAppearance(duckling);
        duckling = new StrongBehavior(duckling);
        duckling.desAppearance();
        duckling.cry();
        duckling.fly();
    }
}
