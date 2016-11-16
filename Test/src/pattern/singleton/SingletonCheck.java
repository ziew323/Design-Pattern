package pattern.singleton;

/**
 * Ë«ÖØ¼ì²é
 * @author jiaziwei
 *
 */
public class SingletonCheck {
    private volatile static SingletonCheck instance = null;

    private SingletonCheck() {
    }

    public static SingletonCheck getInstance() {
        if (instance == null) {
            synchronized (SingletonCheck.class) {
                if (instance == null) {
                    instance = new SingletonCheck();
                }
            }
        }
        return instance;
    }
}
