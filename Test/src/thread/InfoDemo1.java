package thread;

public class InfoDemo1 {
    public static void main(String[] args) throws Exception {
        MyThread2 t1 = new MyThread2();
        Thread proxy = new Thread(t1);
        proxy.setName("test");
        System.out.println(proxy.getId());
        System.out.println(proxy.getName());
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName());
        proxy.start();
        System.out.println("启动后的状态：" + proxy.isAlive());
        Thread.sleep(10L);
        t1.stop();
        Thread.sleep(100L);
        System.out.println("停止后的状态：" + proxy.isAlive());
    }
}
