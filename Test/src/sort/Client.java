package sort;

import sort.common.SortUtil;

public class Client {

    public static void main(String[] args) {
        int a[] = { 3, 1, 5, 7, 2, 4, 6, 8 };
        SortUtil.print(a);
        Sort.heapSort(a);
        SortUtil.print(a);
    }
}
