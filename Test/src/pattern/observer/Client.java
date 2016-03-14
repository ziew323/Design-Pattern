package pattern.observer;

public class Client {
  public static void main(String[] args) throws InterruptedException {
    java.util.Observer liSi = new LiSi();
    HanFeiZi hanFeiZi = new HanFeiZi();
    hanFeiZi.addObserver(liSi);
    hanFeiZi.haveBreakfast();
    hanFeiZi.haveFun();
  }
}
