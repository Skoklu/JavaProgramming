package day21_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SplitStringArray {

    public static void main(String[] args) {


        String sentence = "Wooden Spoon";

        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));


        System.out.println("--------------------------------------------");

        String email = "WoodenSpoon@cydeo.com";

        String [] arr= email.split("@");

        System.out.println(Arrays.toString(arr));

        System.out.println("--------------------------------------------");

        String s = "Today is nice day. Today is Monday. Today we learn Java";

        String [] str = s.split("\\.");
        System.out.println(Arrays.toString(str));
    }
}
