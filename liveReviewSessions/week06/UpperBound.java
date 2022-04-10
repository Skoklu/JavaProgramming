package week06;

public class UpperBound {

    public static void main(String[] args) {


         /* Question-8:

         Write a program to calculate the sum of the numbers from 1 till upper bound.
         If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15.
         If upper bound is 11, sum should be 1 + 2 + ... + 11 = 66.
         If upper bound is 100, sum should be 1 + 2 + ... + 100 = 5050.

         */

        int sum =0;
        for (int i = 1; i <=5 ; i++) {

            sum += i;


        } System.out.print(sum);
        System.out.println();
        System.out.println("-------------------------------------");

        int num = 0;
        for (int i = 1; i <= 11; i++) {
          num += i;
        }
        System.out.println(num);

        System.out.println("----------------------------");

        int num2 = 0;
        for (int i = 1; i <=100 ; i++) {
            num2 += i;


        }
        System.out.println(num2);

    }
}
