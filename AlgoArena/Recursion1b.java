import java.util.*;

public class Recursion1b {
    public static void printNumb(int n) {
        // Base case
        if (n == 11) {
            return;
        }
        System.out.println(n);
        printNumb(n + 1);
    }

    public static void main(String[] args) {
        int n = 1;
        printNumb(n); // n=1
    }

}
