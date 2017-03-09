
import org.jetbrains.annotations.NotNull;

/**
 * Selection sort, no increase.
 *
 * @author wangchuanjun
 */
public class SelectionSort extends Sort {

    @Override
    void sort(@NotNull Comparable[] a, int lo, int hi) {
        for (int i = lo; i <= hi; i++) {
            int minIndex = i;
            for (int j = i + 1; j <= hi; j++)
                if (Sort.less(a[j], a[minIndex]))
                    minIndex = j;
            Sort.exch(a, i, minIndex);
        }
    }

    @Override
    void sort(@NotNull Comparable[] a) {
        sort(a, 0, a.length - 1);
    }
}
