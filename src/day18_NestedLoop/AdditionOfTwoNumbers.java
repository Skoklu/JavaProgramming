package day18_NestedLoop;

import java.util.Scanner;

public class AdditionOfTwoNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your first number");
            int num1 = input.nextInt();

            System.out.println("Enter your second number");
            int num2 = input.nextInt();

            System.out.println("Addition: " + (num1 + num2));

            System.out.println("Would you like to continue?");
            String a = input.next().toLowerCase();

            while (!(a.equals("yes") || a.equals("no"))) { //if the answer is invalid
                System.err.println("Invalid entry, please re-enter");
                a = input.next().toLowerCase();
            }
            if (a.equals("no")) {
                break;  //exits the outer loop

            }

        }
        input.close();
    }
}
