package pattern.strategy;

public class BackDoor implements IStrategy {

  @Override
  public void operate() {
    System.out.println("找乔国老帮忙");
  }

}
