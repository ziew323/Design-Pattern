package sort;

import sort.common.SortUtil;

public class Client {

    public static void main(String[] args) {
        int a[] = { 3, 8, 5, 7, 2, 4, 6, 1 };
        SortUtil.print(a);
        Sort.mergeSort(a);
        SortUtil.print(a);
    }
}
