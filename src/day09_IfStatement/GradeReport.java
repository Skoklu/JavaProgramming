package day09_IfStatement;

public class GradeReport {

    public static void main(String[] args) {

        int n = 45;



        if (n >= 90 && n <100){
            System.out.println("Excellent");
        }
        else if (n >= 80 && n < 89){
            System.out.println("Very good");
        }
        else if (n >= 70 && n <79){
            System.out.println("Good");
        }
        else if (n >= 60 && n <69){
            System.out.println("Pass");
        }
        else {
            System.out.println("Failed");
        }

        System.out.println("-----------------------------------------");

        String grade;

        if (n >= 90 && n <100){
            grade = "A = Excellent";
        }
        else if (n >= 80 && n < 89){
            grade = "B = Very Good";
        }
        else if (n >= 70 && n <79){
            grade = "C = Good";
        }
        else if (n >= 60 && n <69){
            grade = "D = Pass";
        }
        else {
            grade = "E = Failed";
        }
        System.out.println("The grade's result is: "+ grade);



    }
}
//Task:1. garde report ==> A, B, C, D, F