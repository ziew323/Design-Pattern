package pattern.compare.behavior.compress.command;

public class Client {
    public static void main(String[] args) {
        AbstractCmd cmd = new ZipCommandCmd();
        cmd = new GzipCommandCmd();
        Invoker invoker = new Invoker(cmd);
        invoker.execute("c:\\windows", "d:\\windows.zip");
    }
}
