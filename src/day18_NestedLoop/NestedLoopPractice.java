package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Enter your age");
            int age = input.nextInt();

            while ( !( age >=1 && age <=120)){          //while the age is invalid
                System.err.println("Invalid entry; please re-enter");
               age = input.nextInt();
            }
            System.out.println("Would you like continue");
            String a = input.next().toLowerCase();

            while (!(a.equals("yes") ||a.equals("no"))){        //while the answer is invalid

                System.err.println("Invalid Entry, Please re-enter. Would you like to continue?");
                a = input.next().toLowerCase();
            }


            if (a.equals("no")){
                break;
            }
        }
        input.close();
    }
}
