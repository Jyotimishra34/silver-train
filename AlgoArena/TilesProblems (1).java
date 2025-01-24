import java.util.*;

public class TilesProblems {
    public static int placeTiles(int n, int m) {

        // base case
        if (n == m) {
            return 2;
        }

        if (n < m) {
            return 1;
        }
        // vertically placed
        int vertPlacement = placeTiles(n - m, m);

        // horizontally place
        int horiPlacement = placeTiles(n - 1, m);

        return vertPlacement + horiPlacement;
    }

    public static void main(String args[]) {
        // int n = 3, m = 3;
        int n = 4, m = 2;
        int totalPlace = placeTiles(n, m);
        System.out.println(totalPlace);

    }

}
