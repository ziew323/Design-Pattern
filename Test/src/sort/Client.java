package sort;

import sort.common.SortUtil;
import sort.insertion.straight.StraightInsertionSort;

public class Client {

    public static void main(String[] args) {
        int a[] = { 3, 1, 5, 7, 2, 4, 9, 6, 8 };
        SortUtil.print(a);
        StraightInsertionSort.sort(a);
        SortUtil.print(a);
    }
}
