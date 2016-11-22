package pattern.compare.wrapping.star.adapter;

public class Director {

    public static void main(String[] args) {
        IStar star = new FilmStar();
        star.act("The star act in the first 15 minutes");
        IActor actor = new UnknownActor();
        IStar standin = new Standin(actor);
        standin.act("The standin act in the middle 5 minutes");
        star.act("The star act in the last 15 minutes");
    }

}
