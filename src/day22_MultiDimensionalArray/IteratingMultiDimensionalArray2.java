package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray2 {

    public static void main(String[] args) {


        int[][]arr2D = {  {1,2,3}, {4,5,6,7,8}, {9,10,11,12,13}};

        for (int i = arr2D.length - 1; i >= 0; i--) {
// i: index number of 2D arrays starting from last index to the 0

            for (int j = 0; j < arr2D[i].length; j++) {
    // j:index number of elements starting from 0 to last index


                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("--------------------------------------------------------");


        for (int i1 = arr2D.length - 1; i1 >= 0; i1--) {

            for (int j = arr2D[i1].length - 1; j >= 0; j--) {

                System.out.print(arr2D[i1][j]+" ");
            }
            System.out.println();
        }

        System.out.println("--------------------------------------------------");

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = arr2D[i].length - 1; j >= 0; j--) {

                System.out.print(arr2D[i][j]+" ");

            }
            System.out.println();

        }
        System.out.println("-------------------------------------------------------");



        for (int i = 0; i < arr2D.length; i++) {

            for (int j = 0; j < arr2D[i].length; j++) {

                System.out.print(arr2D[i][j]+" ");

            }
            System.out.println();
        }

    }
}
/*
task1 : 9 10 11 12 13
        4 5 6 7 8
        1 2 3

   task2:  13 12 11 10 9
           8 7 6 5 4
           3 2 1

task3 : 3 2 1
        8 7 6 5 4
        13 12 11 10 9

task4: 1 2 3
       4 5 6 7 8
       9 10 11 12 13



 */