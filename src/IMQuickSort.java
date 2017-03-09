/**
 * Improved quick sort, no increase
 *
 * @author wangchuanjun
 */
public class IMQuickSort extends QuickSort {

    private final static int N = 10;

    @Override
    void sort(Comparable[] a, int lo, int hi) {
        if (lo >= hi - N)                   //Exit method
        {
            (new InsertionSort()).sort(a, lo, hi);
            return;
        }

        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }
}
