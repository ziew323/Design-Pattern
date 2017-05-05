package sort;

import java.util.Date;
import java.util.Random;

public class SortTest4 {
    public static void main(String[] args) {
        int[] a = new int[20];
        Random random = new Random(new Date().getTime());
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        SortUtil.print(a);
        heapSort(a);
        SortUtil.print(a);
        System.out.println(SortUtil.check(a));
    }

    public static void heapSort(int[] a) {
        for (int i = (a.length - 1) / 2; i >= 0; i--) {
            buildHeap(a, i, a.length);
        }
        for (int i = a.length - 1; i > 0; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            buildHeap(a, 0, i);
        }
    }

    private static void buildHeap(int[] a, int node, int length) {
        int child = node * 2 + 1;
        while (child < length) {
            if (child + 1 < length && a[child + 1] > a[child]) {
                child++;
            }
            if (a[node] < a[child]) {
                int temp = a[node];
                a[node] = a[child];
                a[child] = temp;
                node = child;
                child = node * 2 + 1;
            } else {
                break;
            }
        }
    }

    public static void quickSort(int[] a) {

    }

    public static void insertSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j = i - 1;
            while (j >= 0 && temp < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
    }

    public static void shellSort(int[] a) {
        int x = a.length;
        while ((x /= 2) > 0) {
            for (int i = x; i < a.length; i += x) {
                int temp = a[i];
                int j = i - x;
                while (j >= 0 && a[j] > temp) {
                    a[j + x] = a[j];
                    j -= x;
                }
                a[j + x] = temp;
            }
        }
    }

}
