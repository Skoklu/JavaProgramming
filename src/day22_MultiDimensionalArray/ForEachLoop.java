package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ForEachLoop {

    public static void main(String[] args) {

        int[][]arr2D = {  {1,2,3}, {4,5,6,7}, {8,9,10,11,12}};
/*
        for (int[] each1DArray : arr2D) {
            for (int eachElement : each1DArray) {

               // System.out.println(Arrays.toString(each1DArray));// This is for every single array eachElement

                System.out.print((eachElement)+" ");
            }
             }

 */

        for (int[] each1DArrays : arr2D) {

            for (int eachElements : each1DArrays) {

                System.out.print(eachElements+" ");

            }



        }




    }
}
