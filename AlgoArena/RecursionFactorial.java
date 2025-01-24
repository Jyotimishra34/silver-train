import java.util.*;

public class RecursionFactorial {
    public static void calculateFactorial(int n, int fact) {
        if (n == 0) {
            System.out.println(fact);
            return;
        }
        fact += n;
        calculateFactorial(n - 1, fact);
    }

    public static void main(String args[]) {
        calculateFactorial(15, 0);
    }

}
