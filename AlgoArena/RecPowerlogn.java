import java.util.*;

public class RecPowerlogn {
    public static int CalcPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        // if n is even
        if (n % 2 == 0) {
            return CalcPower(x, n / 2) * CalcPower(x, n / 2);
        } else { // n is odd
            return CalcPower(x, n / 2) * CalcPower(x, n / 2) * x;
        }

    }

    public static void main(String args[]) {
        int x = 2, n = 5;
        int ans = CalcPower(x, n);
        System.out.println(ans);
    }

}
