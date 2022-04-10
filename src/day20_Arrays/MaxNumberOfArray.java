package day20_Arrays;

import java.util.Arrays;

public class MaxNumberOfArray {

    public static void main(String[] args) {

        int[]numbers = {10, 5, 4, 20, 1, 0};
        int max = numbers[0]; //10

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max) {  //if there is an element in the array that's greater
                // than the current maximum number
                max = numbers[i]; //assigning greater number to variable max

            }

        }
        System.out.println(max);
    }
}
/*
3. Write a program that asks user to enter a number 10 times:
			1. store all user entered numbers in an array
			2. find the max number
			3. find the min number

 */