package day11_Switch_Scanner;

public class Grade {

    public static void main(String[] args) {

        char grade ='B';

        String result =" ";

        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Great Job");
                break;
            case 'C':
                System.out.println("");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
/*
        90 ~ 100: Excellent
        80 ~ 89: Great
        70 ~ 79: Goo
        60 ~ 69:Passed
        0 ~ 59: Failed
         */