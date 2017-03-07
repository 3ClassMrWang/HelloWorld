/**
 * Created by wcjzj on 2017/3/7.
 */

/**
 * Insertion sort, no increase.
 *
 * @author wangchuanjun
 */
public class InsertionSort extends Sort{
    @Override
    void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            Comparable temp = a[i];
            int j = i;
            for(; j > 0 && Sort.less(temp, a[j-1]); j--)
                a[j] = a[j-1];
            a[j] = temp;
        }
    }
}
