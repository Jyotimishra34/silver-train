import java.util.*;

public class RecursionPower {

    public static int CalcPower(int x, int n) {
        if (n == 0) { // base case 1
            return 1;
        }
        if (x == 0) { // base case 2
            return 0;
        }
        // xPownm1 means x to the power n-1
        int xPownm1 = CalcPower(x, n - 1);
        int xPown = x * xPownm1;
        return xPown;
    }

    public static void main(String args[]) {
        int x = 3, n = 5;
        int ans = CalcPower(x, n); // store the calculated value into variable ans
        System.out.println(ans);
    }
}
