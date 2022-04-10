package day10_NestedIf;

public class TernariesIntro {

    public static void main(String[] args) {


        int n = 100;

        if (n % 2 == 0){

            System.out.println("The number is Even");   //String
        }else {
            System.out.println("The number is Odd");   //String
        }

        System.out.println("------------------------------------");

        String result1 = (n % 2 == 0)? "Even ": " Odd";
        System.out.println(result1);


        System.out.println("-------------------------------------");

        int age  = 23;

        if (age >= 21){
            System.out.println("Eligible");    //String
        }
        else {
            System.out.println("Not Eligible");    //String
        }


        System.out.println("---------------------------------------------------");

        String result2 = (age >= 21 ) ? "Eligible"  : "Not Eligible";

        System.out.println(result2);


        System.out.println("------------------------------");

        int number = -30;
        /*
        if (number > 0){
            System.out.println("Positive");
        }
        else  if (number <0){
            System.out.println("negative");
        }else {
            System.out.println("Zero");

         */
        String results3 = (number>0)? " Positive"  :(number < 0)?  "Negative"  :  "Zero";
        System.out.println(results3);
    }
}
