import org.jetbrains.annotations.NotNull;

/**
 * Merge sort, no increase.
 *
 * @author wangchuanjun
 */
public class MergeSort extends Sort {
    private Comparable[] aux;

    public void init(int length) {
        aux = new Comparable[length];
    }

    @Override
    void sort(@NotNull Comparable[] a) {
        init(a.length);
        sort(a, 0, a.length - 1);
    }

    @Override
    void sort(Comparable[] a, int lo, int hi) {
        if (lo >= hi) return;
        int mid = (lo + hi) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    /**
     * Merge a[lo..mid] and a[mid+1..hi].
     *
     * @param a   Array
     * @param lo  Low index
     * @param mid Mid index
     * @param hi  High index
     */
    public void merge(Comparable[] a, int lo, int mid, int hi) {
        int i = lo;
        int j = mid + 1;

        for (int k = lo; k <= hi; k++)
            aux[k] = a[k];

        for (int k = lo; k <= hi; k++) {
            if (i > mid) a[k] = aux[j++];
            else if (j > hi) a[k] = aux[i++];
            else if (Sort.less(aux[i], aux[j])) a[k] = aux[i++];
            else a[k] = aux[j++];
        }
    }
}
