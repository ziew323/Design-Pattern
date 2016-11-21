package pattern.state;

/**
 * Created by DARE2DREAM on 2016/11/20 0020.
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setCurrentState(Context.STATE2);
        context.handle2();
        context.handle1();
    }
}
