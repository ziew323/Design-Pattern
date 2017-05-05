import java.util.ArrayList;
import java.util.List;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void cry(List<? extends Animal> animals) {
        System.out.println("cry");
    }

    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<Cat>();
        cats.add(new Cat("kitty"));
        Cat cat = new Cat("");
        cat.cry(cats);
    }

}
