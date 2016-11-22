package pattern.singleton;

/**
 * 饿汉式
 * @author jiaziwei
 *
 */
public class SingletonHungry {
    private static SingletonHungry instance = new SingletonHungry();

    private SingletonHungry() {
    }

    public static SingletonHungry getInstance() {
        return instance;
    }
}
