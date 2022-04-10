package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();  //Wooden SpoonEnter

        System.out.println("Enter your programming language: ");
        String programming = input.nextLine();  //Java Programing LanguageEnter

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        input.nextLine();   //capture the enter key that user pressed for nextInt()
                            //if we are using nextLine() method after the other method of scanner, we MUST provide one addition nextLine()
        System.out.println("Enter Your School Name");
        String schollName = input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("programmingLanguage = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schollName);

        input.close();


    }
}
