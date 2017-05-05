package sort;

public class SortUtil {
    public static void print(int[] a) {
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static boolean check(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i + 1 < a.length && a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
