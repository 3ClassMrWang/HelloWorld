import edu.princeton.cs.algs4.StdOut;

/**
 * Created by wcjzj on 2017/2/28.
 */
public class HelloWorld {
    public static void main(String[] args) {
        SortCompare sortCompare = new SortCompare();

        StdOut.println("InsertionSort Time: " + sortCompare.time("InsertionSort"));
        StdOut.println("SelectionSort Time: " + sortCompare.time("SelectionSort"));
        StdOut.println("ShellSort Time: " + sortCompare.time("ShellSort"));
        StdOut.println("MergeSort Time: " + sortCompare.time("MergeSort"));
        StdOut.println("IMMergeSort Time: " + sortCompare.time("IMMergeSort"));
        StdOut.println("BUMergeSort Time: " + sortCompare.time("BUMergeSort"));
    }
}