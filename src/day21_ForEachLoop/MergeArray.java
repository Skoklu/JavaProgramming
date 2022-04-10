package day21_ForEachLoop;

import java.util.Arrays;

public class MergeArray {

    public static void main(String[] args) {

       int [] arr1 = {1,2,3,4};
       int [] arr2 = {5,6};

       int []add =new int[arr1.length + arr2.length];

       int i = 0;
        for (int each : arr1) {
           add[i++]=each;
        }
        for (int each : arr2) {
            add [i++]= each;



        }



        System.out.println(Arrays.toString(add));


        System.out.println("---------------------------------------------------------");

       String []group1 = {"Ali", "Layan", "Aysenur"};
       String [] group2 ={"Maria", "Aygun", "Duygu", "Suat", "Valeriy"};

       String [] student = new String[group1.length + group2.length];

       int i2 = 0;

        for (String each : group1) {
           student[i2++] =each;
        }
        for (String each : group2) {
            student[i2++]=each;

        }
        System.out.println(Arrays.toString(student));


        System.out.println("----------------------------------------------------");

        char [] ch1 ={'A', 'B', 'C'};
        char [] ch2 = {'D', 'E', 'F', 'G', 'H'};
        char [] ch3 = {'I', 'J', 'K', 'L', 'M', 'N'};

        char [] chars =new char[ch1.length + ch2.length + ch3.length];

        int i3 =0;
        for (char each : ch1) {
            chars[i3++]=each;
        }
        for (char each : ch2) {
            chars [i3++] =each;
        }
        for (char each : ch3) {
            chars[i3++] =each;

        }
        System.out.println(Arrays.toString(chars));

    }
}
/*
1. write a program that can merge two arrays of integers
		Ex:
			arr1 = {1,2,3,4}
			arr2 = {5,6}

		output
			arr3 = {1,2,3,4,5,6}

 */