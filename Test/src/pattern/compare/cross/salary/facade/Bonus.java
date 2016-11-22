package pattern.compare.cross.salary.facade;

public class Bonus {
    private Attendance atte = new Attendance();

    public int getBonus() {
        int workDays = atte.getWorkDays();
        int bonus = workDays * 1800 / 30;
        return bonus;
    }
}
