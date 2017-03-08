/**
 * Created by Administrator on 2017/3/7.
 */

import org.jetbrains.annotations.NotNull;

/**
 * Improved merge sort, no increase.
 *
 * @author wangchuanjun
 */
public class IMMergeSort extends MergeSort {
    private static final int N = 15;

    @Override
    void sort(Comparable[] a, int lo, int hi) {
        //To decrease time when array have a few items
        if (lo >= hi - N) {
            selectionSort(a, lo, hi);
            return;
        }
        int mid = (lo + hi) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        if (Sort.less(a[mid + 1], a[mid]))
            merge(a, lo, mid, hi);
    }

    private void selectionSort(Comparable[] a, int lo, int hi) {
        for (int i = lo; i <= hi; i++) {
            int minIndex = i;
            for (int j = i + 1; j <= hi; j++)
                if (Sort.less(a[j], a[minIndex]))
                    minIndex = j;
            Sort.exch(a, i, minIndex);
        }
    }
}
