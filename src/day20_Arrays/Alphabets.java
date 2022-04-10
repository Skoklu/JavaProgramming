package day20_Arrays;

import java.util.Arrays;

public class Alphabets {

    public static void main(String[] args) {

        char alphabets[]= new char[26];


        /*       i    ch   while i is increasing, ch is decreasing
        alphabets[0]= 'Z';
        alphabets[1]= 'Y';
        alphabets[2]= 'X';

         */

        /*
        1. method
        char ch = 'Z';
        for (int i = 0; i < alphabets.length ; i++, ch--) {
            alphabets[i]=ch;
        }

         */


        // 2. Method

        for (char i = 0,j = 'Z'; i < alphabets.length ; i++, j--) {
            alphabets[i]=j;

        }
        System.out.println(Arrays.toString(alphabets));
    }
}
