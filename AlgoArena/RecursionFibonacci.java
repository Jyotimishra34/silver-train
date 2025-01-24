import java.util.*;

public class RecursionFibonacci {
    // Function call
    public static void printFab(int a, int b, int n) {
        if (n == 0) { // when n=0 stop the function
            return;
        }
        int c = a + b; // next term of sequence
        System.out.println(c);
        printFab(b, c, n - 1);

    }

    public static void main(String args[]) {
        int n = 10; // Total 10 terms will print in sequence
        int a = 0, b = 1; // already define 0,1
        System.out.println(a);
        System.out.println(b);
        printFab(a, b, n - 2); // n-2 because we have already printed two numbers i.e 0,1

    }

}

// SECOND METHOD TO PRINT FIBONACCI SEQUENCE

// import java.util.*;

// public class Fibonacci {

// public static void printFibo(int a, int b, int n) {
// if (n == 0) {
// return;
// }
// System.out.println(a);
// printFibo(b, a + b, n - 1);
// }

// public static void main(String args[]) {
// printFibo(0, 1, 7);
// }
// }