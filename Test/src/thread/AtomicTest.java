package thread;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;

public class AtomicTest {
    static AtomicInteger ai = new AtomicInteger(1);

    static AtomicIntegerArray ais = new AtomicIntegerArray(new int[] { 1, 2 });

    static AtomicReference<String> ar = new AtomicReference<String>("");

    private static AtomicIntegerFieldUpdater<User> a = AtomicIntegerFieldUpdater.newUpdater(User.class,
        "old");

    public static void main(String[] args) {
        System.out.println(ai.getAndIncrement());
        System.out.println(ai.get());

        System.out.println(ais.get(0));
        System.out.println(ais.getAndIncrement(0));
        System.out.println(ais.get(0));

        System.out.println(ar.compareAndSet("", "new"));
        System.out.println(ar.get());

        User conan = new User("conan", 10);
        System.out.println(a.getAndIncrement(conan));
        System.out.println(a.get(conan));
    }

    public static class User {
        private String name;

        public volatile int old;

        public User(String name, int old) {
            super();
            this.name = name;
            this.old = old;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getOld() {
            return old;
        }

        public void setOld(int old) {
            this.old = old;
        }

    }
}
