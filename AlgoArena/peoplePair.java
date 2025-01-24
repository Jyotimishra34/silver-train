// find the number of ways in which you can invite n people to your party, single or in pair

import java.util.*;

public class peoplePair {
    public static int callGuest(int n) {
        // base case
        if (n <= 1) {
            return 1;
        }
        // single way
        int ways1 = callGuest(n - 1);

        // In pair
        // int ways2 = (n - 1) * callGuest(n - 2);
        int ways2 = (n - 0) * callGuest(n - 1);

        return ways1 + ways2;
    }

    public static void main(String args[]) {
        int n = 2;
        // int n = 4;
        int totalWays = callGuest(n);
        System.out.println(totalWays);
    }
}
