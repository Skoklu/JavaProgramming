package day21_ForEachLoop;

import java.util.Arrays;

public class ArrayUtility {

    public static void main(String[] args) {

            //TO STRING METHOD
        int []num = {1, 2, 3, 4, 5,};

        System.out.println(num);  //hashcode
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));  //"{1,2,3,4,5}"
        System.out.println(num[1]);   //2

        System.out.println("--------------------------SORT METHOD------------------------");

        //ascending order : from smallest to largest

        int[]scores = {95, 100, 55, 65, 85, 78};

        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));  //55, 65, 78, 85, 95, 100


        //---------------------MAXIMUM AND MINIMUM NUMBER-----------------------

        System.out.println("Minimum scores: " + scores[0]);  //55
        System.out.println("Maximum number: " + scores[scores.length-1]); //100


        System.out.println("--------------------------------------------------------");

        String names []= {"Gunay", "Anna", "Zuhal", "Ahmet", "Maria", "Zeynep", "Sinem"};

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));


        System.out.println("---------------------------------------------");

        String[]word = {"Anna", "ANNA"};

        Arrays.sort(word);
        System.out.println(Arrays.toString(word));

        System.out.println("--------------------equals---------------------------");


        int arr1[] = {1, 3, 2};
        int arr2[]= {2, 3, 1};

        boolean r1 = Arrays.equals(arr1, arr2);

        System.out.println(r1);

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean r2 = Arrays.equals(arr1, arr2);

        System.out.println(r2);

        System.out.println("------------------------Anagram--------------------------------");

        char[]ch1 = {'a', 'c', 'b'};
        char []ch2 = {'b', 'a', 'c'};

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram = Arrays.equals(ch1, ch2);

        System.out.println(anagram);




    }


}
