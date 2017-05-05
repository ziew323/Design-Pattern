package thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {

    private int count = 0;

    private static final ExecutorService threadPool = Executors.newFixedThreadPool(10);

    private static CountDownLatch countDownLatch = new CountDownLatch(100);

    public void execute() {
        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                count++;
                countDownLatch.countDown();
            }
        });
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadPoolTest threadPoolTest = new ThreadPoolTest();
        for (int i = 0; i < 100; i++) {
            threadPoolTest.execute();
        }
        countDownLatch.await();
        System.out.println(threadPoolTest.count);
    }
}
