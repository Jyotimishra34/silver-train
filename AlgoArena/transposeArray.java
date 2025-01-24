import java.util.*;

public class transposeArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        // declaring an array
        int matrix[][] = new int[n][m];

        // input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(" The transpose is: ");

        // To print transpose
        for (int j = 0; j < m; j++) { // for rows
            for (int i = 0; i < n; i++) { // for columns
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }

}
