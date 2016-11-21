package pattern.decorator.demo;

public class ConcreteComponent extends Component {

    @Override
    public void operate() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[1];
        System.out.println(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName());
    }

}
