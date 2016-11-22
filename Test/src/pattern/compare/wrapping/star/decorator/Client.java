package pattern.compare.wrapping.star.decorator;

public class Client {

    public static void main(String[] args) {
        IStar freakStar = new FreakStar();
        freakStar = new HotAir(freakStar);
        freakStar = new Deny(freakStar);
        freakStar.act();
    }

}
