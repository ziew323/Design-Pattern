package pattern.visitor;

/**
 * Created by DARE2DREAM on 2016/11/20 0020.
 */
public class Client {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            Element el = ObjectStruture.createElement();
            el.accept(new Visitor());
        }
    }
}
