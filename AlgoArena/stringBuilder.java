import java.util.*;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Sonu");
        System.out.println(sb);

        // character at 0 index
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0, 'M');
        System.out.println(sb);

        sb.insert(2, 'n');
        System.out.println(sb);

        sb.delete(2, 3);
        System.out.println(sb);

        sb.delete(2, 5);
        System.out.println(sb);

        sb.append("h"); // str = str + "h"
        sb.append("e"); // str = str + "e"
        sb.append("l"); // str = str + "l"
        sb.append("l");
        sb.append("o");
        System.out.println(sb);
        System.out.println(sb.length());
    }

}
