package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumbers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many number do you want?");
        int n = scan.nextInt();
        int[] numbers = new int[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + ". number pls");
            numbers[i] = scan.nextInt();
            total += numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(total / n);
        scan.close();






    }
    }

/*

4. AverageNumber:
			1. Ask the user how many numbers they want to enter
			2. get all the inputs from the user and store them into an array
			3. Iterate the array & return the average number


 */
