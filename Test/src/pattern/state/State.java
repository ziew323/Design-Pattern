package pattern.state;

/**
 * Created by DARE2DREAM on 2016/11/20 0020.
 */
public abstract class State {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void handle1();

    public abstract void handle2();
}
