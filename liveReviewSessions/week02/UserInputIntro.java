package week02;

import java.util.Scanner;

public class UserInputIntro {

    public static void main(String[] args) {


        // output goes to console print or println

        System.out.println("output");

        String name = "";

        //How can I receive input my JAVA class

        //1. create your scanner object

        Scanner input = new Scanner(System.in);

        // 2. prompt the user for putting input
        System.out.println("Put your name :"); //this is printed out to console

        //3. get to input

        name = input.next(); //Reads the date from console and assigns the value to my variable

        //4. use the value that I read
        System.out.println("name = " + name);

        //Step 1 and 3 are must, but steps 2 and 4 depends on the situation
        // we need to import scanner class from JAVA utilities
        // import java.util.Scanner; you put this statement at the top of your page before class

        //    input.nextDouble() = double data type input.nextInt() = integer data type
        // nextLine() is used for more than one words

        


    }
}
