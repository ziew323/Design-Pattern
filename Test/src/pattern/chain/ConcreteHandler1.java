package pattern.chain;

public class ConcreteHandler1 extends Handler {

    @Override
    protected Level getHandlerLevel() {
        return Level.level1;
    }

    @Override
    protected Response echo(Request request) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[1];
        return new Response(stackTraceElement.getClassName());
    }

}
