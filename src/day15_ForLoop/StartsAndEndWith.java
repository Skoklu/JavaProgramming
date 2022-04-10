package day15_ForLoop;

import java.util.Locale;

public class StartsAndEndWith {

    public static void main(String[] args) {


        String a = "Wooden Spoon";

        boolean x = a.startsWith("Woo");
        boolean y = a.endsWith("Spoon");
        boolean z = a.toLowerCase().startsWith("wooden"); // in order to case sensitivity -->
        // we first create the lower case of upper case version of  string and than compare it with lowerCase and upperCase

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
