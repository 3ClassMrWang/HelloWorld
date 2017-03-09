import org.jetbrains.annotations.NotNull;

/**
 * Insertion sort, no increase.
 *
 * @author wangchuanjun
 */
public class InsertionSort extends Sort {
    @Override
    void sort(Comparable[] a) {
        sort(a, 0, a.length - 1);
    }

    @Override
    void sort(@NotNull Comparable[] a, int lo, int hi) {
        for (int i = lo; i <= hi; i++) {
            Comparable temp = a[i];
            int j = i;
            for (; j > 0 && Sort.less(temp, a[j - 1]); j--)
                a[j] = a[j - 1];
            a[j] = temp;
        }
    }
}
