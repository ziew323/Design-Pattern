package pattern.compare.cross.salary.mediator;

public class Mediator extends AbsMediator {

    @Override
    public void down(ISalary salary) {
        downSalary();
        downTax();
    }

    @Override
    public void up(ISalary salary) {
        upSalary();
        upTax();
    }

    @Override
    public void down(ITax tax) {
        downTax();
        upSalary();
    }

    @Override
    public void up(ITax tax) {
        upTax();
        downSalary();
    }

    @Override
    public void down(IPosition position) {
        downPosition();
        downSalary();
        downTax();
    }

    @Override
    public void up(IPosition position) {
        upPosition();
        upSalary();
        upTax();
    }

    private void upTax() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[1];
        System.out.println(stackTraceElement.getMethodName());
    }

    private void upSalary() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[1];
        System.out.println(stackTraceElement.getMethodName());
    }

    private void downTax() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[1];
        System.out.println(stackTraceElement.getMethodName());
    }

    private void downSalary() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[1];
        System.out.println(stackTraceElement.getMethodName());
    }

    private void upPosition() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[1];
        System.out.println(stackTraceElement.getMethodName());
    }

    private void downPosition() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[1];
        System.out.println(stackTraceElement.getMethodName());
    }
}
