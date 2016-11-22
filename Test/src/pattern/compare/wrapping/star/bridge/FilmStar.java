package pattern.compare.wrapping.star.bridge;

public class FilmStar extends AbsStar {

    public FilmStar(AbsAction action) {
        super(action);
    }

    public FilmStar() {
        super(new ActFilm());
    }

    @Override
    public void doJob() {
        System.out.println("The filmstar's job");
        super.doJob();
    }

}
