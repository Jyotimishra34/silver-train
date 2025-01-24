import java.util.*;

public class Practice {
    public static void main(String args[]) {
        int n = 5;

        // for (int i = n; i >= 1; i--) {
        // // inner loop
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // }
        // }

        // inverted half pyramid rotated 180
        // for (int i = 1; i <= n; i++) { // upper loop
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" "); // space print
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*"); // star print
        // }

        // System.out.println();
        // }
        // }
        // }

        // number pyramid
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }
        // }
        // }

        // inverted number pyramid
        // for (int i = 1; i <= n; i++) { // outer loop
        // for (int j = 1; j <= n - i + 1; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }
        // }

        // }

        // 0-1 triangle
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // int sum = i + j;
        // if (sum % 2 == 0) {
        // System.out.print(" 1 ");
        // } else {
        // System.out.print(" 0 ");
        // }
        // }
        // System.out.println();
        // }
        // }
        // }

        // floyd's triangle
        int number = 1;
        for (int i = 1; i <= n; i++) { // outer loop
            for (int j = 1; j <= i; j++) { // inner loop
                System.out.print(number + " ");
                number++; // number = number+1
            }
            System.out.println();
        }
    }
}