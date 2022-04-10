package day18_NestedLoop;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your user name");
        String un = input.next();

        System.out.println("Enter your password");
        String pw = input.next();

        if (un.equals("Cydeo") && pw.equals("WoodenSpoon")) {
            System.out.println("Logged in");
        } else {

            for (int i = 1; i < 4; i++) {
                System.out.println("Incorrect username or password");

                System.out.println("Enter your user name");
                un = input.next();

                System.out.println("Enter your password");
                pw = input.next();

                if (un.equals("Cydeo") && pw.equals("WoodenSpoon")) {
                    System.out.println("Logged in");
                    break;
                }


            }
            if (!(un.equals("Cydeo") && pw.equals("WoodenSpoon"))) {
                System.err.println("Your account is locked, Please contact support team");
            }

        }


        input.close();
    }
}
/*
2. You are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                            username: Cydeo
                            password: WoodenSpoon

                Ask the user to enter their credentials.
                        If credentials are matched, your program should print "Logged in."
                        If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is locked."



Nested loop:  loop inside another loop (inner & outer loops)

        one iteration of the outer loop, executes all the iteration of the inner loop

 */