import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Administrator on 2017/3/9.
 * <p>
 * Trinity heap priority queue
 */
public class MaxPQ3<T extends Comparable<T>> {
    private T[] pq;
    private int length = 0;

    public MaxPQ3(int maxLen) {
        pq = (T[]) new Comparable[maxLen + 1];
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int size() {
        return length;
    }

    public void insert(@NotNull T v) {
        pq[++length] = v;
        swim(length);
    }

    public T delMax() {
        T max = pq[1];
        exch(1, length--);
        pq[length + 1] = null;
        sink(1);
        return max;
    }

    public static void main(String[] args) {
        int N = 1000;

        MaxPQ3 queue = new MaxPQ3(N);
        for (int i = 0; i < N; i++)
            queue.insert(StdRandom.uniform(1000));

        for (int i = 0; i < N; i++)
            StdOut.println("DelMax: " + queue.delMax());
    }

    private boolean less(int i, int j) {
        return pq[i].compareTo(pq[j]) < 0;
    }

    private void exch(int i, int j) {
        T temp = pq[i];
        pq[i] = pq[j];
        pq[j] = temp;
    }

    private void swim(int k) {
        while (k > 1 && less((k + 1) / 3, k)) {
            exch(k, (k + 1) / 3);
            k = (k + 1) / 3;
        }
    }

    private void sink(int k) {
        while ((3 * k - 1) <= length) {
            int j = 3 * k - 1;

            if (3 * k == length) {
                if (less(j, j + 1))
                    j++;

            } else if (3 * k + 1 <= length) {
                if (less(j, j + 1))
                    j++;
                if (less(j, (3 * k + 1)))
                    j = 3 * k + 1;
            }

            if (!less(k, j))
                break;

            exch(k, j);
            k = j;
        }
    }
}
