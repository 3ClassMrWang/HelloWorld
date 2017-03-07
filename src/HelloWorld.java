import edu.princeton.cs.algs4.Selection;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by wcjzj on 2017/2/28.
 */
public class HelloWorld {
    public static void main(String[] args) {
        StdOut.println("InsertionSort Time: " + SortCompare.time("InsertionSort"));
        StdOut.println("SelectionSort Time: " + SortCompare.time("SelectionSort"));
        StdOut.println("ShellSort Time: " + SortCompare.time("ShellSort"));
    }
}