import java.util.*;

public class Function {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String args[]) {
        // Take input from user
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        // function call
        printMyName("name of user is: " + name);
    }
}