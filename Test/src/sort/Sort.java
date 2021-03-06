package sort;

public class Sort {

    /**
     * 直接插入排序。</br>
     * 时间复杂度：O（n^2），最好情况：O（n），最坏情况：O（n^2）。</br>
     * 空间复杂度：O（1）。</br>
     * 稳定性：稳定。</br></br>
     * 将一个记录插入到已排序好的有序表中，从而得到一个新记录数增1的有序表。</br>
     * 即：先将序列的第1个记录看成是一个有序的子序列，然后从第2个记录逐个进行插入，直至整个序列有序为止。</br>
     * 要点：设立哨兵，作为临时存储和判断数组边界之用。</br>
     * 直接插入排序是增量为1的希尔排序。</br></br>
     * @param a 待排序集合
     */
    public static void straightInsertionSort(int[] a) {
        shellInsertionSort(a, 1);
    }

    /**
     * 希尔排序（缩小增量排序）。</br>
     * 时间复杂度：O（n^1.3），最好情况：O（n），最坏情况：O（n^2）。</br>
     * 空间复杂度：O（1）。</br>
     * 稳定性：不稳定。</br></br>
     * 先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，
     * 待整个序列中的记录“基本有序”时，再对全体记录进行依次直接插入排序。
     * @param a 待排序集合
     */
    public static void shellSort(int[] a) {
        int dk = a.length;
        while ((dk /= 2) >= 1) {
            shellInsertionSort(a, dk);
        }
    }

    /**
     * 直接插入排序的一般形式</br></br>
     * 1.选择一个增量序列t1，t2，…，tk，其中ti>tj，tk=1；</br>
     * 2.按增量序列个数k，对序列进行k 趟排序；</br>
     * 3.每趟排序，根据对应的增量ti，将待排序列分割成若干长度为m 的子序列，分别对各子表进行直接插入排序。
     * 仅增量因子为1 时，整个序列作为一个表来处理，表长度即为整个序列的长度。
     * @param a 待排序集合
     * @param dk 缩小增量，如果是直接插入排序，dk=1
     */
    private static void shellInsertionSort(int a[], int dk) {
        for (int i = dk; i < a.length; i++) {
            if (a[i] < a[i - dk]) { //若第i个元素大于i-dk元素，直接插入。小于的话，移动有序表后插入  
                int j = i - dk;
                int tmp = a[i]; //复制为哨兵，即存储待排序元素  
                while (j >= 0 && a[j] > tmp) { //查找在有序表的插入位置  
                    a[j + dk] = a[j];
                    j -= dk; //元素后移  
                }
                a[j + dk] = tmp; //插入到正确位置  
            }
        }
    }

    /**
     * 简单选择排序</br></br>
     * 时间复杂度：O（n^2），最好情况：O（n^2），最坏情况：O（n^2）。</br>
     * 空间复杂度：O（1）。</br>
     * 稳定性：不稳定。</br></br>
     * 在要排序的一组数中，选出最小（或者最大）的一个数与第1个位置的数交换；</br>
     * 然后在剩下的数当中再找最小（或者最大）的与第2个位置的数交换；</br>
     * 依次类推，直到第n-1个元素（倒数第二个数）和第n个元素（最后一个数）比较为止。
     * @param a
     */
    public static void simpleSelectionSort(int a[]) {
        int tmp, k, n = a.length;
        for (int i = 0; i < n; i++) {
            k = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[k]) {
                    k = j;
                }
            }
            if (k != i) {
                tmp = a[i];
                a[i] = a[k];
                a[k] = tmp;
            }
        }
    }

    /**
     * 堆排序</br></br>
     * 时间复杂度：O（nlogn），最好情况：O（nlogn），最坏情况：O（nlogn）。</br>
     * 空间复杂度：O（1）。</br>
     * 稳定性：不稳定。</br></br>
     * 堆排序是一种树形选择排序，是对直接选择排序的有效改进。</br>
     * 堆排序需要两个过程，一是建立堆，二是堆顶与堆的最后一个元素交换位置。所以堆排序有两个函数组成。</br>
     * 
     * @param a 待排序集合
     */
    public static void heapSort(int a[]) {
        int length = a.length;
        //初始堆
        buildHeap(a, length);
        //从最后一个元素开始对序列进行调整  
        for (int i = length - 1; i > 0; i--) {
            //交换堆顶元素a[0]和堆中最后一个元素  
            int tmp = a[i];
            a[i] = a[0];
            a[0] = tmp;
            //每次交换堆顶元素和堆中最后一个元素之后，都要对堆进行调整  
            adjustHeap(a, 0, i);
        }
    }

    /**
     * 初始堆进行调整</br></br>
     * 将a[0..length-1]建成堆，调整完之后第一个元素是序列的最大的元素。
     * @param a 待排序集合
     */
    private static void buildHeap(int[] a, int length) {
        //最后一个有孩子的节点的位置 i= (length -1) / 2  
        for (int i = (length - 1) / 2; i >= 0; i--) {
            adjustHeap(a, i, length);
        }
    }

    /**
     * 调整堆排序</br></br>
     * 已知a[s…m]除了a[s] 外均满足堆的定义，</br>
     * 调整a[s],使其成为大顶堆.即将对第s个结点为根的子树筛选,
     * @param a 待排序集合
     * @param s 待调整节点
     * @param length 堆大小
     */
    private static void adjustHeap(int[] a, int s, int length) {
        int tmp = a[s];
        int child = 2 * s + 1; //左孩子结点的位置。(i+1 为当前调整结点的右孩子结点的位置)  
        while (child < length) {
            if (child + 1 < length && a[child] < a[child + 1]) { // 如果右孩子大于左孩子(找到比当前待调整结点大的孩子结点)  
                ++child;
            }
            if (a[s] < a[child]) { // 如果较大的子结点大于父结点  
                a[s] = a[child]; // 那么把较大的子结点往上移动，替换它的父结点  
                s = child; // 重新设置s ,即待调整的下一个结点的位置  
                child = 2 * s + 1;
            } else { // 如果当前待调整结点大于它的左右孩子，则不需要调整，直接退出  
                break;
            }
            a[s] = tmp; // 当前待调整的结点放到比其大的孩子结点位置上  
        }
    }

    /**
     * 冒泡排序</br></br>
     * 时间复杂度：O（n^2），最好情况：O（n），最坏情况：O（n^2）。</br>
     * 空间复杂度：O（1）。</br>
     * 稳定性：稳定。</br></br>
     * 在要排序的一组数中，对当前还未排好序的范围内的全部数，
     * 自上而下对相邻的两个数依次进行比较和调整，让较大的数往下沉，较小的往上冒。</br>
     * 即：每当两相邻的数比较后发现它们的排序与排序要求相反时，就将它们互换。</br>
     * @param a 待排序集合
     */
    public static void bubbleSort(int[] a) {
        int length = a.length;
        int tmp;
        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j > i; j--) {
                if (a[j] < a[j - 1]) {
                    tmp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = tmp;
                }
            }
        }
    }

    /**
     * 快速排序</br></br>
     * 时间复杂度：O（nlogn），最好情况：O（nlogn），最坏情况：O（n^2）。</br>
     * 空间复杂度：O（nlogn）。</br>
     * 稳定性：不稳定。</br></br>
     * 1）选择一个基准元素，通常选择第一个元素或者最后一个元素；</br>
     * 2）通过一趟排序讲待排序的记录分割成独立的两部分，其中一部分记录的元素值均比基准元素值小，另一部分记录的元素值比基准值大；</br>
     * 3）此时基准元素在其排好序后的正确位置；</br>
     * 4）然后分别对这两部分记录用同样的方法继续进行排序，直到整个序列有序。
     * @param a 待排序集合
     */
    public static void quickSort(int[] a) {
        quickSort(a, 0, a.length - 1);
    }

    /**
     * 快速排序递归实现</br></br>
     * 取得基准元素，对低子表排序，对高子表排序
     * @param a 待排序集合
     * @param low 下界
     * @param high 上界
     */
    private static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int pivot = partition(a, low, high); //将表一分为二
            quickSort(a, low, pivot - 1); //递归对低子表递归排序
            quickSort(a, pivot + 1, high); //递归对高子表递归排序
        }
    }

    /**
     * 快速排序交换过程
     * @param a 待排序集合
     * @param low 下界
     * @param high 上界
     * @return 基准元素
     */
    private static int partition(int[] a, int low, int high) {
        int pivot = a[low]; //基准元素
        int tmp;
        while (low < high) { //从表的两端交替地向中间扫描
            //从high所指位置向前搜索，至多到low+1位置，将比基准元素小的交换到低端
            while (low < high && a[high] >= pivot) {
                high--;
            }
            tmp = a[low];
            a[low] = a[high];
            a[high] = tmp;
            //从low所指位置向后搜索，至多到high-1位置，将比基准元素大的交换到高端
            while (low < high && a[low] <= pivot) {
                low++;
            }
            tmp = a[low];
            a[low] = a[high];
            a[high] = tmp;
        }
        return low;
    }

    /**
     * 归并排序</br></br>
     * 时间复杂度：O（nlogn），最好情况：O（nlogn），最坏情况：O（nlogn）。</br>
     * 空间复杂度：O（n）。</br>
     * 稳定性：稳定。</br></br>
     * 1）选择一个基准元素，通常选择第一个元素或者最后一个元素；</br>
     * 2）通过一趟排序讲待排序的记录分割成独立的两部分，其中一部分记录的元素值均比基准元素值小，另一部分记录的元素值比基准值大；</br>
     * 3）此时基准元素在其排好序后的正确位置；</br>
     * 4）然后分别对这两部分记录用同样的方法继续进行排序，直到整个序列有序。
     * @param a 待排序集合
     */
    public static void mergeSort(int[] a) {
        int length = a.length;
        int[] rf = new int[length];
        int len = 1;
        int[] q = a;
        int[] tmp;
        while (len < length) {
            int s = len;
            len = 2 * s;
            int i = 0;
            while (i + len < length) {
                merge(q, rf, i, i + s - 1, i + len - 1); //对等长的两个子表合并  
                i = i + len;
            }
            if (i + s < length) {
                merge(q, rf, i, i + s - 1, length - 1); //对不等长的两个子表合并  
            }
            tmp = q;
            q = rf;
            rf = tmp; //交换q,rf，以保证下一趟归并时，仍从q 归并到rf  
        }
    }

    //将r[i…m]和r[m +1 …n]归并到辅助数组rf[i…n]  
    private static void merge(int[] r, int[] rf, int i, int m, int n) {
        int j, k;
        for (j = m + 1, k = i; i <= m && j <= n; ++k) {
            if (r[j] < r[i])
                rf[k] = r[j++];
            else
                rf[k] = r[i++];
        }
        while (i <= m)
            rf[k++] = r[i++];
        while (j <= n)
            rf[k++] = r[j++];
    }

    /**
     * 基数排序</br></br>
     * 时间复杂度：O（nlogn），最好情况：O（nlogn），最坏情况：O（nlogn）。</br>
     * 空间复杂度：O（n）。</br>
     * 稳定性：稳定。</br></br>
     * 1）选择一个基准元素，通常选择第一个元素或者最后一个元素；</br>
     * 2）通过一趟排序讲待排序的记录分割成独立的两部分，其中一部分记录的元素值均比基准元素值小，另一部分记录的元素值比基准值大；</br>
     * 3）此时基准元素在其排好序后的正确位置；</br>
     * 4）然后分别对这两部分记录用同样的方法继续进行排序，直到整个序列有序。
     * @param a 待排序集合
     */
    public static void radixSort(int[] a) {

    }
}
