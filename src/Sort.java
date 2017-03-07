import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import org.jetbrains.annotations.NotNull;

/**
 * Created by wcjzj on 2017/3/7.
 */
abstract public class Sort {
    abstract void sort(@NotNull Comparable[] a) ;

    public static boolean less(@NotNull Comparable v, @NotNull Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void exch(@NotNull Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void show(@NotNull Comparable[] a) {
        for(Comparable item : a)
            StdOut.print(item + " ");
        StdOut.println();
    }

    public static boolean isSorted(@NotNull Comparable[] a) {
        for(int i = 1; i < a.length; i++)
            if(less(a[i], a[i-1])) return false;
        return true;
    }

    public void main(String[] args) {
        int N = 50000;
        Integer[] array = new Integer[N];
        for(int i = 0; i < N; i++)
            array[i] = StdRandom.uniform(10000000);
        this.sort(array);
        StdOut.println("Array is sorted : " + Sort.isSorted(array));
        Sort.show(array);
    }
}
