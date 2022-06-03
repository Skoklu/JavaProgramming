package day53_FunctionalInterface;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BuildInFunctionalInterfaces2 {

    public static void main(String[] args) {

        //Create a function that can check if the integer is contained in an array of integer, return boolean
        BiPredicate<Integer[], Integer> contains = (a, b) ->{
            boolean result = false;
            for (Integer each : a) {
                if (each == b){
                    result= true;
                    break;
                }

            }
            return result;
        };
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        boolean r1 = contains.test(arr, 11);
        System.out.println(r1);

        System.out.println("------------------------------------------------------------");

        //Create a function that can check if two Strings are anagram
        //                              a =abc,   b= cab
        BiPredicate<String, String> anagram = (a, b) -> {
         String[] arr1 = a.split("");  //[b, a, c]
         String[] arr2 = b.split("");  //[c, a, b]
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return  Arrays.equals(arr1, arr2);


        };

        System.out.println("------------------------------------------------------------");


    }
}
