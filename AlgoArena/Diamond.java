import java.util.*;

public class Diamond {
    public static void main(String args[]) {
        int n = 4;
        // upper half
        for (int i = 1; i <= n; i++) {
            // 1st part- upper half - space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower loop
        for (int i = n; i >= 1; i--) {
            // 1st part- lower half - space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
