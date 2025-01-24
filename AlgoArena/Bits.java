import java.util.*;

// GET BIT
public class Bits {
    public static void main(String args[]) {
        // take the input form the user
        int n = 5;
        // define the position
        int pos = 2;
        // int pos = 3;
        int bitmask = 1 << pos; // calculate bitmask

        // Apply the operation
        if ((bitmask & n) == 0) {
            System.out.println(" bit was zero");
        } else {
            System.out.println("bit was one");
        }
    }

}
