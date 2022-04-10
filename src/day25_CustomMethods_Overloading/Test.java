package day25_CustomMethods_Overloading;

import utilities.ArraysUtility;
import utilities.StringUtility;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        String str = "Java Programming Language";

        StringUtility.printEachChar(str);

        System.out.println("--------------------------------------");

        String str2 = "Wooden Spoon";

        String reverse = StringUtility.reverse(str2);

        System.out.println(reverse);

        StringUtility.reverse(str);

        System.out.println("--------------------------");
        String word = "Civic";

        boolean palindrome = StringUtility.isPalindrome(word);

        System.out.println("palindrome = " + palindrome);

        System.out.println("-------------------------------------------------");

        String []names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};

        int count =0;

        for (String each : names) {
           if (StringUtility.isPalindrome(each)){
               count++;
           }

        }
        System.out.println(count);

        System.out.println("--------------------------------------------------------");

        String str3 = "mean";
        String str4 = "name";

        boolean words = StringUtility.anagram(str3,str4);
       System.out.println(words);

        System.out.println("-----------------------------------------");

        String str5 = "java is a programming language";
         String nonDup = StringUtility.removeDuplicate(str5);

        System.out.println(nonDup);

        System.out.println("-------------------------------------");


    }
}
