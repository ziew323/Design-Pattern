import java.util.List;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void cry(List<? extends Animal> animals);
}
