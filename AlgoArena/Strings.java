import java.util.*;

public class Strings {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        String firstName = "Jyoti";
        String LastName = "Mishra";
        String fullName = firstName + " " + LastName;
        System.out.println(fullName);
        System.out.println(fullName.length());

        // charAt
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

        // comapre

        // String name1 = "Sohan";
        // String name2 = "Rohan";

        String name1 = "Hina";
        String name2 = "Hina";

        // 1 s1 > s2 : +ve value
        // 2 s1 == s2 : 0
        // 3 s1 < s2 : -ve value

        if (name1.compareTo(name2) == 0) {
            // if(name1 == name2){ // some time it not work for other string
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are NOT equal");
        }

        String sentence = " My name is Khan";
        String name = sentence.substring(11, sentence.length());
        System.out.println(name.substring(0, 4));
        // System.out.println(name);

    }

}
