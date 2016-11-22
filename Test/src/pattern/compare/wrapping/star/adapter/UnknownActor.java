package pattern.compare.wrapping.star.adapter;

public class UnknownActor implements IActor {

    @Override
    public void playact(String context) {
        System.out.println("An unknown actor act:" + context);
    }

}
