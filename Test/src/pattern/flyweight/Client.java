package pattern.flyweight;

public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            String subject = "s" + i;
            for (int j = 0; j < 30; j++) {
                String key = subject + "l" + j;
                SignInfoFactory.getSignInfo(key);
            }
        }
        SignInfo signInfo1 = SignInfoFactory.getSignInfo("s1l1");
        signInfo1.setId("1");
        System.out.println(signInfo1.getId());
        SignInfo signInfo2 = SignInfoFactory.getSignInfo("s1l1");
        System.out.println(signInfo2.getId());
    }
}
