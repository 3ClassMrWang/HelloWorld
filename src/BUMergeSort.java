/**
 * Created by Administrator on 2017/3/7.
 */

import org.jetbrains.annotations.NotNull;

/**
 * Bottom up merge sort, no increase.
 *
 * @author wangchuanjun
 */
public class BUMergeSort extends MergeSort {
    @Override
    void sort(@NotNull Comparable[] a, int lo, int hi) {
        init(a.length);
        for (int sz = 1; sz < (hi - lo + 1); sz *= 2)
            for (int loIndex = 0; loIndex < (hi - lo + 1) - sz; loIndex += 2 * sz)
                merge(a, loIndex, loIndex + sz - 1, Math.min(loIndex + 2 * sz - 1, (hi - lo)));
    }

    @Override
    void sort(@NotNull Comparable[] a) {
        sort(a, 0, a.length - 1);
    }
}
