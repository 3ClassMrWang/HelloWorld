/**
 * Created by wcjzj on 2017/3/7.
 */

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Selection sort, no increase.
 *
 * @author wangchuanjun
 */
public class SelectionSort extends Sort{

    @Override
    void sort(Comparable[] a) {
        for(int i = 0; i < a.length; i++)
        {
            int minIndex = i;
            for(int j = i + 1; j < a.length; j++)
                if(Sort.less(a[j], a[minIndex]))
                    minIndex = j;
            Sort.exch(a, i, minIndex);
        }
    }
}
