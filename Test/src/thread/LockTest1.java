package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest1 {
    private List<Integer> arrayList = new ArrayList<Integer>();

    private Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        final LockTest1 test = new LockTest1();
        new Thread("A") {
            public void run() {
                test.insert(Thread.currentThread());
            }
        }.start();

        new Thread("B") {
            public void run() {
                test.insert(Thread.currentThread());
            }
        }.start();
    }

    public void insert(Thread thread) {
        if (lock.tryLock()) {
            try {
                System.out.println("线程" + thread.getName() + "得到了锁...");
                for (int i = 0; i < 50; i++) {
                    arrayList.add(i);
                }
            } catch (Exception e) {

            } finally {
                System.out.println("线程" + thread.getName() + "释放了锁...");
                lock.unlock();
            }
        } else {
            System.out.println("线程" + thread.getName() + "获取锁失败...");
        }
    }

}
