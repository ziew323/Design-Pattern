package thread;

public class InfoDemo2 {
    public static void main(String[] args) throws Exception {
        MyThread2 t1 = new MyThread2();
        Thread p1 = new Thread(t1);
        MyThread2 t2 = new MyThread2();
        Thread p2 = new Thread(t2);

        p1.setPriority(Thread.MIN_PRIORITY);
        p1.setPriority(Thread.MAX_PRIORITY);
        p1.start();
        p2.start();

        Thread.sleep(100L);
        t1.stop();
        t2.stop();
    }
}
