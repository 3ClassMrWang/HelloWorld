/**
 * Created by wcjzj on 2017/3/7.
 */

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * To compare the performance of sort algorithm.
 *
 * @author wangchuanjun
 */
public class SortCompare {
    private static final int N = 5000000;
    private Comparable[] array = null;

    private void randomNumber() {
        array = new Integer[N];
        for (int i = 0; i < N; i++)
            array[i] = StdRandom.uniform(10000000);
    }


    public double time(String func) {
        randomNumber();
        Stopwatch timer = new Stopwatch();
        Class<?> c = null;
        try {
            c = Class.forName(func);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Sort sort = null;
        try {
            sort = (Sort) c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        sort.sort(array);
        double processTime = timer.elapsedTime();
        StdOut.println("Array is sorted : " + Sort.isSorted(array));
//        Sort.show(array);
        return processTime;
    }
}
