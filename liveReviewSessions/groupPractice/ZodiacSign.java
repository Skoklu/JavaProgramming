package groupPractice;

import java.util.Scanner;
public class ZodiacSign {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your birth hour please.");
        int birthHour =input.nextInt();

        System.out.println("Enter your birth minute please.");
        int birthMinute=input.nextInt();

        System.out.println(birthHour+":"+birthMinute);
        input.close();
    }
}
//As a user, I would like to enter my birth time. {00:00}