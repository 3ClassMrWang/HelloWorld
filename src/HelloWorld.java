import edu.princeton.cs.algs4.StdOut;

public class HelloWorld {
    public static void main(String[] args) {
        SortCompare sortCompare = new SortCompare();

        StdOut.println("InsertionSort Time: " + sortCompare.time("InsertionSort"));
        StdOut.println("SelectionSort Time: " + sortCompare.time("SelectionSort"));
        StdOut.println("ShellSort Time: " + sortCompare.time("ShellSort"));
        StdOut.println("MergeSort Time: " + sortCompare.time("MergeSort"));
        StdOut.println("IMMergeSort Time: " + sortCompare.time("IMMergeSort"));
        StdOut.println("BUMergeSort Time: " + sortCompare.time("BUMergeSort"));
        StdOut.println("QuickSort Time: " + sortCompare.time("QuickSort"));
        StdOut.println("IMQuickSort Time: " + sortCompare.time("IMQuickSort"));
        StdOut.println("Quick3WaySort Time: " + sortCompare.time("Quick3WaySort"));
    }
}