package day18_NestedLoop;

public class NestedLoopPracticeRectangle2 {

    public static void main(String[] args) {


        //This is nested "FOR LOOP"
        for (int j = 0; j < 10; j++) {


        for (int i = 0; i < 10; i++) {
            System.out.print("* ");
        }
            System.out.println();
        }

        System.out.println("-------------------------------------");

        //This is only single "FOR LOOP"

        for (int i = 0; i < 10; i++) {

            System.out.println("* * * * * * * * * *");

        }


    }
}
/*
1. Print the following shape by using a nested Loop:
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
 */