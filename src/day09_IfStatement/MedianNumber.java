package day09_IfStatement;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 10,
            b = 20,
            c = 30;

        //If we have three different numbers, one must be maximum, one must be minimum & one must be median


        //              a= 15, b= 10, c= 20    a= 15, b= 20, c= 10
        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);

        /*
        in order of a to be the median number:
        1. if c is the maximum number & b is the minimum number, then a is the median number
        2. if b is the maximum number & c is the minimum number, then a is the median number
         */

        //                 b= 15, c= 10, a= 20   b= 15, c= 20, a= 10
        boolean bIsMedian = (b > a && b < c) || (b > c && b < a);


        /*
        in order of b to be the median number:
        1. if a is the maximum number & c is the minimum number, then b is the median number
        2. if c is the maximum number & a is the minimum number, then b is the median number
         */

        boolean cIsMedian =  !aIsMedian && !bIsMedian;

        /*
        in order of c to be the median number:
        1. if b is the maximum number & a is the minimum number, then c is the median number
        2. if a is the maximum number & b is the minimum number, then c is the median number
         */


        if (aIsMedian){
            System.out.println(a+ " is the Median Number");
        }

        if (bIsMedian){
            System.out.println(b + " is the Median Number");
        }

        if (cIsMedian){
            System.out.println(c + " is the Median Number");
        }

    }
}

/*2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

        Ex:
        a = 10, b= 15, c = 20;

        Output:
        15 is the median number


        Possibility #1: a could be median number
        Possibility #2: b could be median number
        Possibility #3: c could be median number

        Single if is for one condition

 */



