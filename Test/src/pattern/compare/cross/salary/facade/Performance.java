package pattern.compare.cross.salary.facade;

import java.util.Random;

public class Performance {
    private BasicSalary salary = new BasicSalary();

    public int getPerformanceValue() {
        int perf = (new Random()).nextInt(100);
        return salary.getBasicSalary() * perf / 100;
    }
}
