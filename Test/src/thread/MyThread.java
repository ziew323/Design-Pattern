package thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyThread {
    private int count = 0;

    private static final BlockingQueue<Runnable> WORK_QUEUE = new LinkedBlockingQueue<Runnable>(1000 * 1000);

    private static final ExecutorService readThreadPool = new ThreadPoolExecutor(50, 100, 1L,
        TimeUnit.MINUTES, WORK_QUEUE);

    public void doSomething(int size) {
        readThreadPool.submit(new Runnable() {

            @Override
            public void run() {
                System.out.println(++count);
                if (count == size) {
                    System.out.println(size + "=" + count);
                }
            }
        });

    }

    public static void main(String[] args) {
        //ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        MyThread myThread = new MyThread();
        for (int i = 0; i < 10; i++) {
            myThread.doSomething(i);
            /*final int index = i;
            singleThreadExecutor.execute(new Runnable() {
                public void run() {
                    try {
                        System.out.println(index);
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });*/
        }
    }
}
