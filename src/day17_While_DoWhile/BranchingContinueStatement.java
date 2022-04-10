package day17_While_DoWhile;

public class BranchingContinueStatement {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E' ; i++) {

            if (i == 'C'){
                continue;  // for skipping
            }
            System.out.println(i);
        }
        System.out.println("----------------------------------------------");

        // Print all the odd number between 0 ~ 100

        for (int i = 1; i <=100 ; i++) {

            if (i % 2 != 0){
                continue;
            }
            System.out.print(" " + i);
        }

        System.out.println("---------------------------------------");

        // Print all the odd number between 0 ~ 100

        for (int i = 1; i <=100 ; i++) {

            if (i % 2 == 0){
               continue;
            }
            System.out.print(i +" ");


        }
    }
}
