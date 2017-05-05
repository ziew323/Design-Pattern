package thread;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LockTest5 {
    private ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();

    public static void main(String[] args) {
        final LockTest5 test = new LockTest5();

        Runnable readThread = new Runnable() {

            @Override
            public void run() {
                test.read(Thread.currentThread());
            }
        };

        Runnable writeThread = new Runnable() {

            @Override
            public void run() {
                test.write(Thread.currentThread());
            }
        };

        for (int i = 0; i < 10; i++) {
            if (i > 0 && i % 3 == 0) {
                new Thread(writeThread, String.valueOf(i)).start();
            } else {
                new Thread(readThread, String.valueOf(i)).start();
            }
        }

    }

    public void read(Thread thread) {
        int count = 10;
        rwl.readLock().lock(); // 在外面获取锁
        try {
            System.out.println("线程" + thread.getName() + "开始读操作...");
            while (count > 0) {
                System.out.println("线程" + thread.getName() + "正在进行读操作...");
                count--;
            }
            System.out.println("线程" + thread.getName() + "读操作完毕...");
        } finally {
            rwl.readLock().unlock();
        }
    }

    public void write(Thread thread) {
        int count = 20;
        rwl.writeLock().lock(); // 在外面获取锁
        try {
            System.out.println("线程" + thread.getName() + "开始写操作...");
            while (count > 0) {
                System.out.println("线程" + thread.getName() + "正在进行写操作...");
                count--;
            }
            System.out.println("线程" + thread.getName() + "写操作完毕...");
        } finally {
            rwl.writeLock().unlock();
        }
    }
}
