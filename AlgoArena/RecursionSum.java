import java.util.*;

public class RecursionSum {
    public static void printSum(int sum, int n) {

        // Base case
        if (n == 0) {
            System.out.println(sum);
            return;
        }

        sum += n;
        printSum(n - 1, sum);

    }

    public static void main(String args[]) {
        printSum(10, 0);
    }

}
