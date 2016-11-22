package pattern.compare.cross.salary.mediator;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        IPosition position = new Position(mediator);
        ISalary salary = new Salary(mediator);
        ITax tax = new Tax(mediator);
        position.promote();
        salary.increaseSalary();
        tax.drop();
    }
}
