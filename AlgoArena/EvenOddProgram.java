import java.util.*;

public class EvenOddProgram {
    public static String checkEvenOdd(int number) {
        // for (int i = 1; i <= number; i++) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int inputNumber = sc.nextInt();
        // function call
        String result = checkEvenOdd(inputNumber);
        System.out.println(inputNumber + " is " + result);
        sc.close();
    }
}