package pattern.strategy;

public class ZhaoYun {
  public static void main(String[] args) {
    Context context;
    System.out.println("--第一个--");
    context = new Context(new BackDoor());
    context.operate();
    System.out.println("--第二个--");
    context = new Context(new GivenGreenLight());
    context.operate();
    System.out.println("--第三个--");
    context = new Context(new BlockEnemy());
    context.operate();
  }
}
