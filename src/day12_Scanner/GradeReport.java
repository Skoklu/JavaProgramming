package day12_Scanner;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the score: ");
        int g = input.nextInt();

        String result = " ";
        if (g >= 0 && g <= 100){
          result = (g >= 90 && g <= 100)? "A": (g >= 80 && g <= 89)? "B": (g >= 70 && g <= 79)? "C":
                  (g >= 60 && g <= 69)? "D": "F";
        }else {
         result = ("Invalid Score");
        }
        System.out.println(result);

        input.close();
    }
}
/*
2. GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score

 */