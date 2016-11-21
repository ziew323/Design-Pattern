package pattern.flyweight;

import java.util.HashMap;

public class SignInfoFactory {

    private static HashMap<String, SignInfo> pool = new HashMap<String, SignInfo>();

    @Deprecated
    public static SignInfo SignInfo() {
        return new SignInfo();
    }

    public static SignInfo getSignInfo(String key) {
        SignInfo result = null;
        if (!pool.containsKey(key)) {
            System.out.println(key + "---build object and put into the pool");
            result = new SignInfo4Pool(key);
            pool.put(key, result);
        } else {
            result = pool.get(key);
            System.out.println(key + "---get from the pool");
        }
        return result;
    }
}
