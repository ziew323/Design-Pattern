package base.lambda.example;

public class RunnableTest {
    public static void main(String[] args) {
        new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("A thread is running before Java8.");
            }
        }).start();
        ;

        new Thread(() -> System.out.println("A thread is running in Java8.")).start();
    }
}
