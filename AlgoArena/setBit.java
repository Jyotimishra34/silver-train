import java.util.*;

public class setBit {
    public static void main(String args[]) {
        // Take the number from user
        int n = 6;
        // define the position
        int pos = 3;
        int bitMask = 1 << pos; // calculate the bitMask

        // store the final value in newNumber
        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
}
