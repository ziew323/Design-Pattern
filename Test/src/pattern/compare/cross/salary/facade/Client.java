package pattern.compare.cross.salary.facade;

import java.util.Date;

public class Client {
    public static void main(String[] args) {
        HRFacade facade = new HRFacade();
        int salary = facade.querySalary("zhang san", new Date());
        System.out.println("zhang san's salary is " + salary);
        int workDays = facade.queryWorkDays("li si");
        System.out.println("li si' workdays is " + workDays);
    }
}
