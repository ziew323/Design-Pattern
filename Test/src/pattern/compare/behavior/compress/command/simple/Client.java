package pattern.compare.behavior.compress.command.simple;

public class Client {
    public static void main(String[] args) {
        AbstractCmd cmd = new AddCmd();
        Invoker invoker = new Invoker(cmd);
        int result = invoker.execute(1, 2);
        System.out.println(result);
    }
}
