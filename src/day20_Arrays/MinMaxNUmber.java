package day20_Arrays;

import java.util.Scanner;

public class MinMaxNUmber {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        int []numbers = new int[10];
        for (int i = 0; i <numbers.length ; i++) {
            System.out.println("Enter a number");
            numbers[i] = input.nextInt();  //each user entered input will be assigned to the index of the array numbers
        }
            int max =numbers[0];
            int min =numbers[0];
            for (int i = 0; i < numbers.length; i++) {

                if (numbers[i]> max){
                    max= numbers[i];
            }
                if (numbers[i] < min){
                    min = numbers[i];

                }
        }
        System.out.println(max);
        System.out.println(min);

        input.close();
    }
}
