package arithmetic;

public class Lock extends Thread {

    public static Object o1 = new Object(), o2 = new Object();

    private boolean flag;

    public Lock(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (o1) {
                System.out.println("o1 lock");
                synchronized (o2) {
                    System.out.println("o2 lock");
                }
            }
        } else {
            synchronized (o2) {
                System.out.println("o2 lock");
                synchronized (o1) {
                    System.out.println("o1 lock");
                }
            }
        }
    }

    public static void main(String[] args) {
        Lock lock1 = new Lock(true);
        Lock lock2 = new Lock(false);
        lock1.start();
        lock2.start();
    }
}
