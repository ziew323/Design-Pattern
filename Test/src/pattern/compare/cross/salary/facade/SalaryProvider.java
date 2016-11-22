package pattern.compare.cross.salary.facade;

public class SalaryProvider {
    private BasicSalary basicSalary = new BasicSalary();

    private Bonus bonus = new Bonus();

    private Performance perf = new Performance();

    private Tax tax = new Tax();

    public int totalSalary() {
        return basicSalary.getBasicSalary() + bonus.getBonus() + perf.getPerformanceValue() - tax.getTax();
    }
}
