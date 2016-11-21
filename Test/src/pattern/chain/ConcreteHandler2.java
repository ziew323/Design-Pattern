package pattern.chain;

public class ConcreteHandler2 extends Handler {

    @Override
    protected Level getHandlerLevel() {
        return Level.level2;
    }

    @Override
    protected Response echo(Request request) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[1];
        return new Response(stackTraceElement.getClassName());
    }

}
