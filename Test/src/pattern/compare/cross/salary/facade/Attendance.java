package pattern.compare.cross.salary.facade;

import java.util.Random;

public class Attendance {
    public int getWorkDays() {
        return (new Random()).nextInt(30);
    }
}
