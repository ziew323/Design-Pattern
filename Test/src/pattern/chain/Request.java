package pattern.chain;

public class Request {
    private String requestStr;

    private Level level = Level.level1;

    public Request(Level level, String requestStr) {
        this.level = level;
        this.requestStr = requestStr;
    }

    public String getRequest() {
        return this.requestStr;
    }

    public Level getRequestLevel() {
        return this.level;
    }
}
