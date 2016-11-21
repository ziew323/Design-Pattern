package pattern.chain;

public class Response {
    private String result;

    public Response(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return result;
    }
}
