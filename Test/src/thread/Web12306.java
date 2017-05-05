package thread;

public class Web12306 implements Runnable {

    private int num = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (Web12306.class) {
                if (num <= 0) {
                    break;
                }
                System.out.println(Thread.currentThread().getName() + "抢到了" + num--);
            }
        }
    }

    public static void main(String[] args) {
        Web12306 web12306 = new Web12306();
        Thread t1 = new Thread(web12306, "黄牛甲");
        Thread t2 = new Thread(web12306, "黄牛乙");
        Thread t3 = new Thread(web12306, "黄牛丙");

        t1.start();
        t2.start();
        t3.start();
    }

}
