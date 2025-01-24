import java.util.*;

public class RecuSebsequences {

    // subsequence function
    public static void subSequences(String str, int idx, String newString) {
        // base case
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        // to be
        subSequences(str, idx + 1, newString + currChar);

        // or not to be
        subSequences(str, idx + 1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        // String str = "abcd";
        // functon call
        subSequences(str, 0, " ");
    }
}
