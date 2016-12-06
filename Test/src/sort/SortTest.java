package sort;

public class SortTest {
    public static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = a.length - 1; j > i; j--) {//j>i写为j<i
                if (a[j] < a[j - 1]) {
                    int tmp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = tmp;
                }
            }
        }
    }

    public static void quickSort(int[] a) {
        quickSort(a, 0, a.length - 1);
    }

    private static void quickSort(int[] a, int low, int high) {
        if (low < high) {//此处为if不是while
            int pivot = partition(a, low, high);
            quickSort(a, low, pivot - 1);
            quickSort(a, pivot + 1, high);
        }
    }

    private static int partition(int[] a, int low, int high) {
        int pivot = a[low];
        int tmp;
        while (low < high) {
            while (low < high && a[high] > pivot) {//此处为while不是if
                high--;
            }
            tmp = a[low];
            a[low] = a[high];
            a[high] = tmp;
            while (low < high && a[low] < pivot) {//此处为while不是if
                low++;
            }
            tmp = a[low];
            a[low] = a[high];
            a[high] = tmp;
        }
        return low;
    }

    //这种方式交换次数多
    /*public static void simpleSelectionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }*/

    //定义一个值k指向选定值，每次遍历结束后交换，可减少交换次数
    public static void simpleSelectionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int k = i;
            for (int j = i; j < a.length; j++) {
                if (a[j] < a[k]) {
                    k = j;
                }
            }
            if (k > i) {
                int tmp = a[i];
                a[i] = a[k];
                a[k] = tmp;
            }
        }
    }

    public static void heapSort(int[] a) {
        buildHeap(a);
        for (int i = a.length - 1; i > 0; i--) {
            int tmp = a[i];
            a[i] = a[0];
            a[0] = tmp;
            adjustHeap(a, 0, i);
        }
    }

    private static void buildHeap(int[] a) {
        for (int i = (a.length - 1) / 2; i >= 0; i--) {//i>=0，等号别丢了，首个元素也需调整
            adjustHeap(a, i, a.length);
        }
    }

    private static void adjustHeap(int[] a, int s, int length) {//length为长度
        int child = 2 * s + 1;
        while (child < length) {
            if (child + 1 < length && a[child] < a[child + 1]) {//需判断child + 1 < length
                child++;
            }
            if (a[child] > a[s]) {
                int tmp = a[s];
                a[s] = a[child];
                a[child] = tmp;
                s = child;
                child = 2 * s + 1;//切记
            } else {
                break;//勿忘，否则死循环
            }
        }
    }

    public static void straightInsertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                int j = i - 1;
                int tmp = a[i];
                a[i] = a[j];
                while (j >= 0 && a[j] > tmp) {
                    a[j + 1] = a[j];
                    j--;
                }
                a[j + 1] = tmp;
            }
        }
    }

    public static void shellSort(int[] a) {
        int dk = a.length;
        while ((dk /= 2) >= 1) {
            shellSort(a, dk);
        }
    }

    private static void shellSort(int[] a, int dk) {
        for (int i = dk; i < a.length; i += dk) {
            int j = i - dk;
            int tmp = a[i];
            while (j >= 0 && a[j] > tmp) {
                a[j + dk] = a[j];
                j -= dk;
            }
            a[j + dk] = tmp;
        }
    }
}
