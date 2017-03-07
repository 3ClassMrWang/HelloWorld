/**
 * Created by wcjzj on 2017/3/7.
 */

import edu.princeton.cs.algs4.Stopwatch;

/**
 * To compare the performance of sort algorithm.
 *
 * @author wangchuanjun
 */
public class SortCompare {
    public static double time(String func) {
        Stopwatch timer = new Stopwatch();
        Class<?> c = null;
        try {
            c = Class.forName(func);
        }catch (Exception e) {
            e.printStackTrace();
        }
        Sort sort = null;
        try {
            sort = (Sort)c.newInstance();
        }catch (Exception e) {
            e.printStackTrace();
        }
        sort.main(null);
        return timer.elapsedTime();
    }
}
