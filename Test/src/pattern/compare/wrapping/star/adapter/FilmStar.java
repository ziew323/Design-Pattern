package pattern.compare.wrapping.star.adapter;

public class FilmStar implements IStar {

    @Override
    public void act(String context) {
        System.out.println("The star act:" + context);
    }

}
