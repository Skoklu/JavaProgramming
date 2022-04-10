package day09_IfStatement;

public class PosNegZero {

    public static void main(String[] args) {

        int num = -100;

        if (num > 0){
            System.out.println("Positive");
        }

        if (num < 0){
            System.out.println("Negative");
        }
        if (num == 0){
            System.out.println("Zero");
        }

        System.out.println("-----------------------------------");

        if (num > 0){
            System.out.println("the number is positive");

        }else if (num < 0){
            System.out.println("The number is negative");

        }else {
            System.out.println("the number is zero");
        }

        System.out.println("-------------------------------");

        boolean positive = num > 0;
        boolean negative = num < 0;

        if (positive){
            System.out.println("Positive");
        }else if (negative){
            System.out.println("Negative");
        }else {
            System.out.println("Zero");
        }





    }
}
/*
Multi-branch if: when there are three or more option/possibilities

		if(Condition1){
			StatementA
		}else if(Condition2){
			StatementB
		}else{
			StatementC
		}

		ONLY one block gets executed

		StatementA: Condition1 MUST be true
		StatementB: Condition1 MUST be false, Condition2 MUST be true
		StatementC: Condition1 & Condition2 MUST be false

 */