package base.sort;

import java.util.Comparator;

public class MyFruitComparator implements Comparator<Fruit> {

    @Override
    public int compare(Fruit fruit1, Fruit fruit2) {
        return Double.valueOf(fruit1.getPrice()).compareTo(fruit2.getPrice());
    }

}
