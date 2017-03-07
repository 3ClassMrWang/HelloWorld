/**
 * Created by wcjzj on 2017/3/7.
 */

import org.jetbrains.annotations.NotNull;

/**
 * Shell sort, no increase.
 *
 * @author wangchuanjun
 */
public class ShellSort extends Sort{

    @Override
    void sort(@NotNull Comparable[] a) {
        int N = 5;
        int h = 1;
        while(h < a.length/N)   h = N * h + 1;

        while(h >= 1) {
            for(int i = h; i < a.length; i++) {
                Comparable temp = a[i];
                int j = i;
                for(; j >= h && Sort.less(temp, a[j-h]); j -= h)
                    a[j] = a[j-h];
                a[j] = temp;
            }
            h = h / N;
        }
    }
}
