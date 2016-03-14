package pattern.decorator;

public class Father {
  public static void main(String[] args) {
    //把成绩单拿过来
    SchoolReport sr;
    sr = new FouthGradeSchoolReport();
    sr = new HighScoreDecorator(sr);
    sr = new SortDecorator(sr);

    //看成绩单
    sr.report();
    sr.sign("老三");
  }
}
