package thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest2 {
    private Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        LockTest2 test = new LockTest2();
        Thread thread1 = new MyLockThread2(test, "A");
        Thread thread2 = new MyLockThread2(test, "B");
        thread1.start();
        thread2.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.interrupt();
    }

    public void insert(Thread thread) throws InterruptedException {
        if (lock.tryLock(4, TimeUnit.SECONDS)) {
            try {
                System.out
                    .println("time=" + System.currentTimeMillis() + " ,线程 " + thread.getName() + "得到了锁...");
                long now = System.currentTimeMillis();
                while (System.currentTimeMillis() - now < 5000) {
                    // 为了避免Thread.sleep()而需要捕获InterruptedException而带来的理解上的困惑,
                    // 此处用这种方法空转3秒
                }
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("线程 " + thread.getName() + "放弃了对锁的获取...");
        }
    }

}

class MyLockThread2 extends Thread {

    private LockTest2 test = null;

    public MyLockThread2(LockTest2 test, String name) {
        super(name);
        this.test = test;
    }

    public void run() {
        try {
            test.insert(Thread.currentThread());
        } catch (Exception e) {
            System.out.println(
                "time=" + System.currentTimeMillis() + " ,线程 " + Thread.currentThread().getName() + "被中断...");
        }
    }
}
