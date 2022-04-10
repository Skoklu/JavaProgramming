package day15_ForLoop;

import java.util.Locale;

public class FormatFullName2 {

    public static void main(String[] args) {


        String firstName = "cyDEo",
                secondName = "SCHOOL";

        firstName = (""+firstName.charAt(0)).toUpperCase()+firstName.substring(1).toLowerCase();

        secondName = (""+secondName.charAt(0)).toUpperCase()+secondName.substring(1).toLowerCase();

        System.out.println(firstName + " "+ secondName);

    }
}
