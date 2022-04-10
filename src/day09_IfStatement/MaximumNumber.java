package day09_IfStatement;

public class MaximumNumber {
    public static void main(String[] args) {


        int num1 = 354;
        int num2 = 412;

        boolean num1IsMax = (num1 > num2),
                num2IsMax = (num2 > num1);

        if(num1IsMax){
            System.out.println("Num 1 is Maximum");

        }else {
            System.out.println("Num 2 is Maximum");
        }

    }




}
