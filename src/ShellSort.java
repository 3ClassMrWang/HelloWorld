/**
 * Created by wcjzj on 2017/3/7.
 */

import org.jetbrains.annotations.NotNull;

/**
 * Shell sort, no increase.
 *
 * @author wangchuanjun
 */
public class ShellSort extends Sort {

    @Override
    void sort(@NotNull Comparable[] a) {
        sort(a, 0, a.length - 1);
    }

    @Override
    void sort(@NotNull Comparable[] a, int lo, int hi) {
        int N = 5;
        int h = 1;
        while (h < (hi - lo + 1) / N) h = N * h + 1;

        while (h >= 1) {
            for (int i = h; i <= hi; i++) {
                Comparable temp = a[i];
                int j = i;
                for (; j >= h && Sort.less(temp, a[j - h]); j -= h)
                    a[j] = a[j - h];
                a[j] = temp;
            }
            h = h / N;
        }
    }
}
