package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Call {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Race tortoise = new Race("乌龟", 1000);
        Race rabbit = new Race("兔子", 500);
        Future<Integer> result1 = executorService.submit(tortoise);
        Future<Integer> result2 = executorService.submit(rabbit);

        Thread.sleep(2000);
        tortoise.setFlag(false);
        rabbit.setFlag(false);

        int num1 = result1.get();
        int num2 = result2.get();

        System.out.println("乌龟跑了" + num1 + "步");
        System.out.println("兔子跑了" + num2 + "步");

        executorService.shutdown();
    }

}

class Race implements Callable<Integer> {
    private String name;

    private long time;

    private boolean flag = true;

    private int step = 0;

    public Race() {
    }

    public Race(String name) {
        super();
        this.name = name;
    }

    public Race(String name, long time) {
        super();
        this.name = name;
        this.time = time;
    }

    @Override
    public Integer call() throws Exception {
        while (flag) {
            Thread.sleep(time);
            step++;
        }
        return step;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

}