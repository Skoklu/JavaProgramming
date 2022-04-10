package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int min = 2147483647;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            int num = input.nextInt();

            if (num < min){

                min=num;
            }

        }
        System.out.println("min = "+min);



 input.close();
    }
}
/*
Write a program that asks the user to enter a number for 5 times.
        return the minimum number
 */