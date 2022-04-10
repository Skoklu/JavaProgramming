package day11_Switch_Scanner;


import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Integer: ");
        int num1 = input.nextInt();

        System.out.println("Enter a Decimal: ");
        double num2 = input.nextDouble();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Multiplication: "+(num1 * num2));

        input.close();  //This means that Scanner is closed, unless scanner will continue to work at the background.
        //after Closes Scanner the Scanner can not be used anymore.

/*
        System.out.println("Enter an integer: ");
        int num3 = input.nextInt();
        System.out.println(num3);
        */
    }
}
