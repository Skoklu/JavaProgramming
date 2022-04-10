package day19_LoopPractice;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number");
            int num = input.nextInt();

            if (num % 2 == 0) {
                System.out.println("Even Number");
            } else {
                System.out.println("Odd number");
            }
            System.out.println("Would you like to enter another number? (yes/no");
            String a = input.next();

            if (!(a.equalsIgnoreCase("yes")|| a.equalsIgnoreCase("no"))){
                System.out.println("Invalid entry");
                System.exit(0);
            }

            System.exit(0);

            if (a.equalsIgnoreCase("no")){
                break;
            }
            input.close();
        }
    }
}
