import java.util.*;

public class PrimeChecker {
    public static boolean Prime(int number) {
        boolean Prime = true;
        if (number <= 1) {
            Prime = false;
            return Prime;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    Prime = false;
                    break;
                }
            }
            return Prime;

        }
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        // Function call
        boolean Prime = Prime(number);
        if (Prime) {
            System.out.println("It is a prime number");
        } else {
            System.out.println("It is not a prime number");
        }
        sc.close();
    }
}
