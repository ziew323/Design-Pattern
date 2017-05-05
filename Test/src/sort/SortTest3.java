package sort;

import java.util.Date;
import java.util.Random;

public class SortTest3 {
    public static void main(String[] args) {
        int[] a = new int[20];
        Random random = new Random(new Date().getTime());
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(50);
        }
        SortUtil.print(a);
        heapSort(a);
        SortUtil.print(a);
        System.out.println(SortUtil.check(a));
    }

    public static void bubbleSort(int[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static void quickSort(int[] a) {
        quickSort(a, 0, a.length - 1);
    }

    private static void quickSort(int[] a, int low, int high) {
        if (low >= high) {
            return;
        }
        int temp = a[low];
        int left = low;
        int right = high;
        while (left < right) {
            while (left < right && a[right] >= temp) {
                right--;
            }
            a[left] = a[right];
            while (left < right && a[left] <= temp) {
                left++;
            }
            a[right] = a[left];
        }
        a[left] = temp;
        quickSort(a, low, left - 1);
        quickSort(a, left + 1, high);
    }

    public static void straightInsertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
    }

    public static void shellSort(int[] a) {
        int x = a.length;
        while ((x /= 2) >= 1) {
            for (int i = x; i < a.length; i++) {
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

    public static void simpleSelectionSort(int[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            int k = 0;
            for (int j = 0; j <= i; j++) {
                if (a[j] > a[k]) {
                    k = j;
                }
            }
            int temp = a[i];
            a[i] = a[k];
            a[k] = temp;
        }
    }

    public static void heapSort(int[] a) {
        buildHeap(a);
        for (int i = a.length - 1; i > 0; i--) {
            int temp = a[i];
            a[i] = a[0];
            a[0] = temp;
            adjustHeap(a, 0, i);
        }
    }

    private static void buildHeap(int[] a) {
        for (int i = (a.length - 1) / 2; i >= 0; i--) {
            adjustHeap(a, i, a.length);
        }
    }

    private static void adjustHeap(int[] a, int node, int length) {
        int child = node * 2 + 1;
        while (child < length) {
            if (child + 1 < length && a[child + 1] > a[child]) {
                child++;
            }
            if (a[child] > a[node]) {
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
}
