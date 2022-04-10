package day20_Arrays;

import java.util.Arrays;

public class OneToHundred {

    public static void main(String[] args) {

        int [] number = new int[100];



        for (int i = 0, j=1; i < 100 &&j<=100 ; i++,j++) {

        number[i] =j;
        }
        System.out.println(Arrays.toString(number));

    }
}
//1. create an array that has the numbers 1 to 100