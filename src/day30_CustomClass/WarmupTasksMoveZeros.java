package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmupTasksMoveZeros {

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        Collections.swap(numbers, 0, numbers.size()-1);

        System.out.println(numbers);  //ArraysList has "toString" utility itself

        System.out.println("--------------------------------------------");

        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(arr)); //But Array doesn't have "toString" utility itself.--->
                                                    // You have to write it manually.

        System.out.println("------------------remove All Zeros end-------------------------------");

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        System.out.println("list = " + list);

        int size = list.size();

        System.out.println("size = " + size);

        list.removeAll(Arrays.asList(0));

        System.out.println("list = " + list);

        int newSize = list.size();

        int totalNumberOfZeros = size - newSize;

        System.out.println("totalNumberOfZeros = " + totalNumberOfZeros);

        for (int i = 0; i < totalNumberOfZeros; i++) {
            list.add(0);


        }
        System.out.println("list = " + list);

        System.out.println("-----------------------------remove All Zeros end---------------------");

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list2) {
            if (each != 0) {
                result.add(each);
            }
        }
        for (Integer each : list2) {
            if (each == 0) {
                result.add(each);
            }
        }

        System.out.println("result = " + result);

        System.out.println("-------------letter---digits----specialCharacters--------------");

        String str ="ABCD123$%#@&456EFG!";

        ArrayList<Character> chars = new ArrayList<>();

       for(int i = 0; i< str.length(); i++){
           chars.add(str.charAt(i));

       }
       ArrayList<Character> letters = new ArrayList<>(chars);  //add all the characters
        letters.removeIf( p-> !Character.isLetter(p));  //removes the characters that are not letters
        System.out.println("letters = " + letters);


        ArrayList<Character> digit = new ArrayList<>(chars);//add all the characters
        digit.removeIf(p-> !Character.isDigit(p));//removes the characters that are not digits
        System.out.println("digit = " + digit);


        ArrayList<Character> specialChar = new ArrayList<>();

        specialChar.removeAll(letters);
        specialChar.removeAll(digit);

        System.out.println("specialChar = " + specialChar);




    }

}
/*
1. write a program that can swap the first and last elements of an integer arraylist
	            ex:
	                list = [1,2,3,4,5];
	                output: [5,2,3,4,1];

2.Write a program that can move all the zeros to the last index of ArrayList

            Ex:
               list : {1,0,2,0,3,0,4,0};

               output:
                    [1,2,3,4,0,0,0,0]

 3. Write  a program that can extract the special character, digits, and letters
 from a String and stores them into seprate ArrayList of characters

            Ex:
              str ="ABCD123$%#@&456EFG!@"

              output:
                   list1: {1,2,3,4,5,6}
                   list2:{A,B,C,D,E,F,G }
                   list3:{ $,%,#,@,&,! }
 */