import java.util.*;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        // A number less than or equal to 0 cannot be a power of 2
        if (n <= 0) {
            return false;
        }
        // check if the number has exactly one bit set
        return (n & (n - 1)) == 0;
    }

    public static void main(String args[]) {
        int num = 64;
        if (isPowerOfTwo(num)) {
            System.out.println(num + "is a power of 2");
        } else {
            System.out.println(num + "is not a power of 2");
        }
    }

}
