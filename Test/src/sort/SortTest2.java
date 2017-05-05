package sort;

public class SortTest2 {
    public static void main(String[] args) {
        int a[] = { 3, 8, 5, 7, 2, 4, 6, 10, 9, 1, 15, 14, 13, 11, 12 };
        SortUtil.print(a);
        SortTest2.shellSort(a);
        SortUtil.print(a);
    }

    public static void bubbleSort(int[] a) {
        for (int i = a.length - 1; i > 0; i--) {//for (int i = a.length; i > 0; i++) {
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
        int l = low;
        int r = high;
        int temp = a[l];
        while (l < r) {
            while (l < r && a[r] >= temp) {
                r--;
            }
            a[l] = a[r];
            while (l < r && a[l] <= temp) {
                l++;
            }
            a[r] = a[l];
        }
        a[l] = temp;
        quickSort(a, low, l - 1);
        quickSort(a, l + 1, high);
    }

    public static void simpleSelectionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int k = i;
            for (int j = i; j < a.length; j++) {
                if (a[j] < a[k]) {
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

    public static void straightInsertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int j = i - 1;
            int temp = a[i];
            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
    }

    public static void shellSort(int[] a) {
        int x = a.length;
        while ((x = x / 2) >= 1) {
            for (int i = x; i < a.length; i++) {
                int j = i - x;
                int temp = a[i];
                for (; j >= 0 && a[j] > temp; a[j + x] = a[j], j -= x)
                    ;
                a[j + x] = temp;
            }
        }
    }

}
