package day53_FunctionalInterface;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

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



        //Create a function that can print the given String for given number of times
        BiConsumer<String, Integer> printMultipleTimes = (s, n)->{
            for (int i = 0; i < n; i++) {
                System.out.println(s);

            }
        };
        printMultipleTimes.accept("Java", 10);

        System.out.println("------------------------------------------------------------");

        //Create a function that takes first and last names and returns the formatted full name

        //"jAvA", "PROGRAMMING"

        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abdulhamid","SM");
        scrumTeam1.put("Nikita","Developer");
        scrumTeam1.put("Alina","Developer");
        scrumTeam1.put("Mert","PO");
        scrumTeam1.put("Lee","SDET");

       /* for (Map.Entry<String, String> entry : scrumTeam1.entrySet()) {
            String k = entry.getKey();
            String v = entry.getValue();
            System.out.println(k+ " : "+v);
            }
      */
         //same with before lines
        scrumTeam1.forEach((k, v)-> System.out.println(k+ " : "+v));

    }
}
