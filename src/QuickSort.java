/**
 * Created by Administrator on 2017/3/8.
 */

/**
 * Quick sort, no increase.
 *
 * @author wangchuanjun
 */
public class QuickSort extends Sort {
    @Override
    void sort(Comparable[] a) {
        sort(a, 0, a.length - 1);
    }

    @Override
    void sort(Comparable[] a, int lo, int hi) {
        if (lo >= hi)                   //Exit method
            return;

        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    public static int partition(Comparable[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        Comparable v = a[lo];

        while (true) {
            while (Sort.less(a[++i], v)) if (i >= hi) break;
            while (Sort.less(v, a[--j])) if (j <= lo) break;
            if (i >= j) break;
            Sort.exch(a, i, j);
        }

        Sort.exch(a, lo, j);
        return j;
    }
}
