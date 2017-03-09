import edu.princeton.cs.algs4.StdOut;
import org.jetbrains.annotations.NotNull;

abstract public class Sort {
    abstract void sort(Comparable[] a);

    abstract void sort(Comparable[] a, int lo, int hi);

    protected static boolean less(@NotNull Comparable v, @NotNull Comparable w) {
        return v.compareTo(w) < 0;
    }

    protected static void exch(@NotNull Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    protected static void show(@NotNull Comparable[] a) {
        for (Comparable item : a)
            StdOut.print(item + " ");
        StdOut.println();
    }

    protected static boolean isSorted(@NotNull Comparable[] a) {
        for (int i = 1; i < a.length; i++)
            if (less(a[i], a[i - 1])) return false;
        return true;
    }
}
