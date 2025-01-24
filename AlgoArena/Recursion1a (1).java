import java.util;

public class Recursion1a {
    // recursive function
    public static void printNumb(int n) {
        // Base case
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumb(n - 1);

    }

    public static void main(String args[]) {
        int n = 10;
        printNumb(n);
    }

}
