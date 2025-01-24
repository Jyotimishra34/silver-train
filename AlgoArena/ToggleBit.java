
// CODE BY MYSELF
import java.util.*;

public class ToggleBit {
    public static void main(String args[]) {
        int n = 5;
        int pos = 3;

        int bitMask = 1 << pos;

        int newNumber = bitMask ^ n;
        System.out.println(newNumber);

    }

}

// CODE BY CHATGPT
// public class ToggleBit {
// // Method to toggle a bit at a given position
// public static int toggleBit(int n, int pos) {
// // Create a bitmask with a 1 at the position to toggle
// int bitmask = 1 << pos;
// // Toggle the bit at the given position using XOR
// return n ^ bitmask;
// }

// public static void main(String[] args) {
// // Test cases
// int number = 5; // binary: 0101
// int position = 3;

// System.out.println("Original number: " + number + " (binary: " +
// Integer.toBinaryString(number) + ")");
// int toggledNumber = toggleBit(number, position);
// System.out.println(
// "Toggled number: " + toggledNumber + " (binary: " +
// Integer.toBinaryString(toggledNumber) + ")");
// }
// }
