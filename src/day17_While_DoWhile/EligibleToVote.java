package day17_While_DoWhile;

import java.util.Locale;
import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();   //valid age 1~ 120

        while (!(age >=1 && age<= 120)){        //while the age is invalid
            System.err.println("Invalid age, please re-enter");  //err or out
            System.err.println("Enter your age");    //err or out
            age = input.nextInt();
        }

        System.out.println("Are you a US citizen? yes/no");
        String answer = input.next().toLowerCase();

        while(! (answer.equals("yes") || answer.equals("no"))){
            System.err.println("Invalid entry, please re-enter");    //err or out
            System.err.println("Are you a US citizen? yes/no");    //err or out
           answer = input.next().toLowerCase();
        }
       if (age >=18 && answer.equals("yes")){
           System.out.println("You are eligible to vote");
       }else {
           System.out.println("You are not eligible to vote");


           input.close();

           //if we use IF STATEMENT we can enter 1 time not more
       }
    }
}
