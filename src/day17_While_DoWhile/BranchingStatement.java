package day17_While_DoWhile;

import java.util.Scanner;

public class BranchingStatement {

    public static void main(String[] args) {


        for (char i = 'A'; i <= 'Z'; i++) {

            System.out.print(i+" ");

            if (i=='F'){
                break;    //Exits the loop before 'F' character
            }
                //OR you can put here this  -->  System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("------------------------------");

        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("Enter anumber");
            int num = input.nextInt();

            if (num <0){
                break;


            }
        }
input.close();
    }
}
