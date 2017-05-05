package thread;

public class SynDemo {
    public static void main(String[] args) {
        Object goods = new Object();
        Object money = new Object();

        Test t1 = new Test(goods, money);
        Test t2 = new Test(goods, money);
        Thread proxy1 = new Thread(t1);
        Thread proxy2 = new Thread(t2);
        proxy1.start();
        proxy2.start();
    }
}

class Test implements Runnable {
    Object goods;

    Object money;

    public Test(Object goods, Object money) {
        super();
        this.goods = goods;
        this.money = money;
    }

    @Override
    public void run() {
        while (true) {
            test();
        }
    }

    public void test() {
        synchronized (goods) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (money) {

            }
        }
        System.out.println("一手给钱");
    }
}

class Test2 implements Runnable {
    Object goods;

    Object money;

    public Test2(Object goods, Object money) {
        super();
        this.goods = goods;
        this.money = money;
    }

    @Override
    public void run() {
        while (true) {
            test();
        }
    }

    public void test() {
        synchronized (money) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (goods) {

            }
        }
        System.out.println("一手给货");
    }
}