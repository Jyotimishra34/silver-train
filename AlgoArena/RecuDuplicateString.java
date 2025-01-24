
// Remve duplicates in a string
 //  "abbccda"
 
import java.util.*;

public class RecuDuplicateString {
    // create a static map
    public static boolean[] map = new boolean[26];

    // recursive function
    public static void removeDuplicates(String str, int idx, String newString) {

        // base case
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            removeDuplicates(str, idx + 1, newString);

        } else {
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newString);
        }
    }

    public static void main(String[] args) {
        String str = "abbccda";
        // funtion call
        removeDuplicates(str, 0, " ");

    }

}
