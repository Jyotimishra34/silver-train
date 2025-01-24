import java.util.*;

public class Function3 {
    // function
    public static int calculateProduct(int a, int b) {
        int product = a * b;
        System.out.println(product);
        return product;
    }

    public static void main(String args[]) {
        // input
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // function call
        int product = calculateProduct(a, b);
        System.out.println("product of 2 number is:" + product);
    }
}
