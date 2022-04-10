package day17_While_DoWhile;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number");
        int num1 = input.nextInt();

        System.out.println("Enter your second number");
        int num2 = input.nextInt();

        System.out.println("Enter a math operator");
        char ch = input.next().charAt(0);

       /* if (!(ch == '+' || ch == '-')){
            System.err.println("Invalid operator, please re-enter");
             ch = input.next().charAt(0);

            IF WE DO THIS PROGRAM  WITH "IF CONDITION" 1 TIME WE ENTER AGAIN BUT IF WE DO
            "WHILE LOOP" WE CAN ENTER INFINITE TIME UNTIL WE FIND RIGHT OPERATOR
        */

        /*
        "FOR LOOP" IS NOT THE BEST SOLUTION FOR THIS FRAGMENT
         */
        while (!(ch == '+' || ch == '-')){
            System.out.println("Invalid operator, please re-enter");
            ch = input.next().charAt(0);
        }
        System.err.println((ch == '+') ? num1 + num2: num1 - num2 );

        input.close();
    }
}
