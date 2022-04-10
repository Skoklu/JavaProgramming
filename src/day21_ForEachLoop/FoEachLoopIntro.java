package day21_ForEachLoop;

import java.util.Arrays;

public class FoEachLoopIntro {

    public static void main(String[] args) {


        int[] numbers = {10, 20, 30, 40, 50, 60, 70};

        for (int i = 0; i < numbers.length; i++) {  // i : Indexof the Array
            int eachElement = numbers[i];

            System.out.print(eachElement + " ");




            }
        System.out.println("");
        System.out.println("--------------------------------------------");
        for (int each :numbers) {   // each : Elements of the Array

            System.out.print(each +" ");


            //you never change the iteration times and order, because they are fixed in the "for each loop"
            //And you never reversed in the "For each Loop"
        }
    }
}
