package week09;

import java.util.Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        //Find the biggest number in eac array and store it to another one dimensional array
        int [][] arr = { {3,12,3,34,12}, {13,7,456,34,3}, {-5, -24, -2, -10, -4} };

        //I want to print this 2D array
        System.out.println(Arrays.deepToString(arr));

        int []maxNum = new int[arr.length];
        // arr.length  the size of 2D array
        for (int i = 0; i < arr.length; i++) {

            int max  = arr[i][0];
            for (int each : arr[i]) {    // this statement means first element of each array at index i

                if (each>max){
                    max = each;
                }

            }
            maxNum[i]=max;

        }
        System.out.println(Arrays.toString(maxNum));

    }
}
