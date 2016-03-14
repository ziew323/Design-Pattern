package pattern.observer;

import java.util.Observable;
import java.util.Observer;

public class LiSi implements Observer {

  public void update(Observable observable, Object obj) {
    System.out.println("李斯观察到韩非子活动");
    this.reportToQinShiHuang(obj.toString());
    System.out.println("李斯汇报完毕");
  }

  private void reportToQinShiHuang(String str) {
    System.out.println("李斯报告秦始皇，韩非子有活动:" + str);
  }
}
