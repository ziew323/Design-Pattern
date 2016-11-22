package pattern.compare.cross.salary.facade;

import java.util.Random;

public class Tax {
    public int getTax() {
        return (new Random()).nextInt(300);
    }
}
