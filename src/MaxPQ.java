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

    }

    public T delMax() {

        return pq[1];
    }

    /**
     * Function for compare two <see>Comparable</see> object.
     *
     * @param i
     * @param j
     * @return true, i < j
     * false, i >= j
     */
    private boolean less(int i, int j) {
        return pq[i].compareTo(pq[j]) < 0;
    }

    /**
     * Function for exchange two Comparable object.
     *
     * @param i
     * @param j
     */
    private void exch(int i, int j) {
        T temp = pq[i];
        pq[i] = pq[j];
        pq[j] = temp;
    }

    /**
     * Swim one item from bottom.
     *
     * @param k
     */
    private void swim(int k) {
        while (k > 1 && less(k / 2, k)) {
            exch(k / 2, k);
            k /= 2;
        }
    }

    private void sink(int k) {

    }
}
