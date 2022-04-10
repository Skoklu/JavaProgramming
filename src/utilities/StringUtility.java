package utilities;

import java.util.Arrays;

public class StringUtility {

    //Prints each character of the given String
    public static void printEachChar (String str){

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));

        }
    }

    //reverse the given String and returns the reversed string
    public static String reverse (String str){  //"Java"
      String result = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            result += str.charAt(i);

        }
        return result;  //  "avaJ"
    }

    //Checks if the given String is palindrome, returns boolean
    public static boolean isPalindrome(String str){

        return reverse(str).equalsIgnoreCase(str);

    }

// Check if the given strings are anagram, returns boolean
    public static boolean anagram (String str1, String str2){    //"mean", "name"

        char []ch1 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }

    //removes the duplicates from given string, return Strings
    public static String removeDuplicate (String str){

        String result ="";

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if (!result.contains(""+each)){
                result += each;
            }

        }
        return result;
    }

}
