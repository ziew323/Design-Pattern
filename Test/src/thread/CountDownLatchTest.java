package thread;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
    static CountDownLatch c = new CountDownLatch(2);

    public static void main(String[] args) throws InterruptedException {
        new Thread() {
            @Override
            public void run() {
                c.countDown();
                System.out.println("1");
                c.countDown();
                System.out.println("2");
            }
        }.start();
        c.await();
        System.out.println("3");
    }
}
