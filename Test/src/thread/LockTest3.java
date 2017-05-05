package thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest3 {
    private Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        LockTest3 test = new LockTest3();
        Thread thread1 = new MyLockThread3(test, "A");
        Thread thread2 = new MyLockThread3(test, "B");
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
        //注意，如果需要正确中断等待锁的线程，必须将获取锁放在外面，然后将 InterruptedException 抛出
        lock.lockInterruptibly();
        try {
            System.out.println("线程 " + thread.getName() + "得到了锁...");
            long startTime = System.currentTimeMillis();
            for (;;) { // 耗时操作
                if (System.currentTimeMillis() - startTime >= Integer.MAX_VALUE)
                    break;
                //插入数据
            }
        } finally {
            System.out.println(Thread.currentThread().getName() + "执行finally...");
            lock.unlock();
            System.out.println("线程 " + thread.getName() + "释放了锁");
        }
        System.out.println("over");
    }

}

class MyLockThread3 extends Thread {

    private LockTest3 test = null;

    public MyLockThread3(LockTest3 test, String name) {
        super(name);
        this.test = test;
    }

    public void run() {
        try {
            test.insert(Thread.currentThread());
        } catch (Exception e) {
            System.out.println("线程 " + Thread.currentThread().getName() + "被中断...");
        }
    }
}
