package thread;

import java.util.concurrent.TimeUnit;

public class Join {

    public static void main(String[] args) throws Exception {
        Thread previos = Thread.currentThread();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Domino(previos), String.valueOf(i));
            thread.start();
            previos = thread;
        }
        TimeUnit.SECONDS.sleep(5);
        System.out.println(Thread.currentThread().getName() + " terminate.");
    }

    static class Domino implements Runnable {
        private Thread thread;

        public Domino(Thread thread) {
            super();
            this.thread = thread;
        }

        @Override
        public void run() {
            try {
                thread.join();
            } catch (Exception e) {
                // TODO: handle exception
            }
            System.out.println(Thread.currentThread().getName() + " terminate.");

        }

    }
}
