package day15_ForLoop;

import java.util.Scanner;

public class FormatFullName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name and last name ");
        String firstName = input.next();
        String secondName = input.next();

        firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        secondName = secondName.substring(0,1).toUpperCase()+secondName.substring(1).toLowerCase();

        System.out.println(firstName + " " + secondName);







        input.close();
    }
}
/*
	3. Write a program that asks user to enter first and last names,
	and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School

 */