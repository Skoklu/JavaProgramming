package day19_LoopPractice;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = input.nextInt();

        System.out.println("Enter a math operator");
        char operator = input.next().charAt(0);

        if (!(operator =='-' || operator == '+')){
            System.err.println("Invalid operator: "+ operator);
            System.exit(0);  //because of this "System.exit" program executed not continue
        }
        System.out.println("Enter a number");
        int num2 = input.nextInt();

        if (operator=='-'){
            System.out.println(num - num2);
        }else {
            System.out.println(num + num2);
        }

        input.close();
    }
}
