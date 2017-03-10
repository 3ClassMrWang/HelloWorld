import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Heap-based priority queue
 *
 * @author wangchuanjun
 * @since 2017.3.9
 */
public class MaxPQ<T extends Comparable<T>> {
    private T[] pq;
    private int length = 0;

    public MaxPQ(int maxLen) {
        pq = (T[]) new Comparable[maxLen + 1];
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int size() {
        return length;
    }

    public void insert(T v) {
        pq[++length] = v;
        swim(length);
//        recuSwim(length);
    }

    public T delMax() {
        T max = pq[1];
        exch(1, length--);
        pq[length + 1] = null;
        sink(1);
//        recuSink(1);
        return max;
    }

    public static void main(String[] args) {
        int N = 1000;

        MaxPQ queue = new MaxPQ(N);
        for (int i = 0; i < N; i++)
            queue.insert(StdRandom.uniform(1000));

        for (int i = 0; i < N; i++)
            StdOut.println("DelMax: " + queue.delMax());
    }

    /**
     * Function for compare two <see>Comparable</see> object.
     *
     * @param i i
     * @param j j
     * @return true, i < j
     * false, i >= j
     */
    private boolean less(int i, int j) {
        return pq[i].compareTo(pq[j]) < 0;
    }

    /**
     * Function for exchange two Comparable object.
     *
     * @param i i
     * @param j j
     */
    private void exch(int i, int j) {
        T temp = pq[i];
        pq[i] = pq[j];
        pq[j] = temp;
    }

    /**
     * Swim one item from bottom.
     *
     * @param k Location of object
     */
    private void swim(int k) {
        while (k > 1 && less(k / 2, k)) {
            exch(k / 2, k);
            k /= 2;
        }
    }

    /**
     * Recursive version of <code>swim</code>
     *
     * @param k Location of object
     */
    private void recuSwim(int k) {
        if (k <= 1 || pq[k].compareTo(pq[k / 2]) <= 0)
            return;

        exch(k, k / 2);
        recuSwim(k / 2);
    }

    /**
     * Sink one item from top.
     *
     * @param k Location of object
     */
    private void sink(int k) {
        while (2 * k <= length) {
            int j = 2 * k;
            if (j < length && less(j, j + 1)) j++;
            if (!less(k, j)) break;
            exch(k, j);
            k = j;
        }
    }

    /**
     * Recursive version of <code>sink</code>
     *
     * @param k Location of object
     */
    private void recuSink(int k) {
        if (2 * k > length)
            return;

        if (2 * k == length && !less(k, 2 * k))
            return;

        int j = 2 * k;
        if (2 * k + 1 <= length) {
            if (less(j, j + 1)) j++;
            if (!less(k, j)) return;
        }

        exch(k, j);
        recuSink(j);
    }
}
