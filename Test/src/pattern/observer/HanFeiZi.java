package pattern.observer;

import java.util.Observable;

public class HanFeiZi extends Observable implements IHanFeiZi {
  @Override
  public void haveBreakfast() {
    System.out.println("韩非子吃饭");
    super.setChanged();
    super.notifyObservers("韩非子在吃饭");
  }

  @Override
  public void haveFun() {
    System.out.println("韩非子娱乐");
    super.setChanged();
    super.notifyObservers("韩非子在娱乐");
  }
}
