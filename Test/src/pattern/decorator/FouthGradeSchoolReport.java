package pattern.decorator;

public class FouthGradeSchoolReport extends SchoolReport {

  //我的成绩单
  @Override
  public void report() {
    //成绩单的格式是这个样子
    System.out.println("尊敬的家长：");
    System.out.println("。。。。。");
    System.out.println("语文62 数学65");
    System.out.println("。。。。。");
    System.out.println("家长签名：");
  }

  //家长签名
  @Override
  public void sign(String name) {
    System.out.println("家长签名为：" + name);

  }

}
