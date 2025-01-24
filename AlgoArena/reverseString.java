import java.util.*;

public class reverseString {
    public static void main(String args[]) {
        // using StringBuilder class
        StringBuilder sb = new StringBuilder("HelloWorld");

        // we need to reverse half words i.e sb.length()/2
        for (int i = 0; i < sb.length() / 2; i++) {
            // calculate front index and back index
            int front = i;
            int back = sb.length() - i - 1; // 5-1-0 =>4

            // replace front character with backchar
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            // StringBuilder function
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println(sb);

    }

}
