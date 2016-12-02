package sort.insertion.straight;

import sort.common.SortUtil;

/**
 * 插入排序。
 * 将一个记录插入到已排序好的有序表中，从而得到一个新记录数增1的有序表。
 * 即：先将序列的第1个记录看成是一个有序的子序列，然后从第2个记录逐个进行插入，直至整个序列有序为止。
 * 要点：设立哨兵，作为临时存储和判断数组边界之用。
 * 时间复杂度：O（n^2）。
 * @author jiaziwei
 *
 */
public class StraightInsertionSort {
    public static void sort(int[] a) {
        sort(a, a.length);
    }

    private static void sort(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            System.out.printf("插入第%d个元素\n", i);
            if (a[i] < a[i - 1]) {//若第i个元素大于i-1元素，直接插入。小于的话，移动有序表后插入
                int j = i - 2;//遍历位置
                int x = a[i];//复制为哨兵，即存储待排序元素  
                a[i] = a[i - 1]; //先后移一个元素  
                System.out.printf("[%d] ", x);
                SortUtil.print(a);
                while (j >= 0 && x < a[j]) {//检测边界，比较大小
                    a[j + 1] = a[j];
                    j--;//元素后移  
                    System.out.printf("[%d] ", x);
                    SortUtil.print(a);
                }
                a[j + 1] = x;//插入到正确位置  
            }
            System.out.print("排序结果：");
            SortUtil.print(a);
        }
    }
}
