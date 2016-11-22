package pattern.compare.wrapping.star.bridge;

public class Client {
    public static void main(String[] args) {
        AbsStar zhangSan = new FilmStar();
        AbsStar liSi = new Singer();
        zhangSan.doJob();
        liSi.doJob();
        liSi = new Singer(new ActFilm());
        liSi.doJob();
    }
}
