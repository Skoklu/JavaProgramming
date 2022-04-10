package day25_CustomMethods_Overloading;

import utilities.ArraysUtility;

public class Test2 {

    public static void main(String[] args) {

        int []arr1 = {10, 20, 30, 40, 50, 60};
        ArraysUtility.printEachElement(arr1);

        System.out.println("-----------------------------------------------");

        double []arr2 = {2.3, 3.4, 4.5, 5.6, 6.7};
        ArraysUtility.printEachElement(arr2);

        System.out.println("-----------------------------------------------");

        char []arr3 = {'a', 'b', 'c', 'd', 'e'};
        ArraysUtility.printEachElement(arr3);

        System.out.println("----------------------------------");

        String[]arr4 = {"Java", "C#", "Python", "Chrome"};
        ArraysUtility.printEachElement(arr4);

        System.out.println("-----------------------------------");

        int []num1 = {-3, 5, 0, 21, 65, -90, -7};
        int max1 = ArraysUtility.max(num1);
        System.out.println("max1 = " + max1);

        System.out.println("---------------------------------------");

        double [] num2 = {8.7, 7.6, 6.5, 5.4, 4.3, 90.0};
        double max2 = ArraysUtility.max(num2);
        System.out.println("max2 = " + max2);

        System.out.println("----------------------------------------");
        int []num3= {6, 98, 0, -2, -34, 32, 345};
        int min1 = ArraysUtility.min(num3);
        System.out.println("min1 = " + min1);

        System.out.println("------------------------------------------");
        double []num4 ={-87.8, 5, 7.6, 45.2, -3};
       double min2 = ArraysUtility.min(num4);
        System.out.println("min2 = " + min2);

        System.out.println("------------------------------------------");
        int []a1 = {1,2,3,4,5,6,7};
        boolean r1 =ArraysUtility.contains(a1,7);
        System.out.println("r1 = " + r1);

        System.out.println("-------------------------------------------");
        double []a2 ={2.3, 3.4, 4.5, 5.6, 6.7} ;
        boolean r2 = ArraysUtility.contains(a2, 8.3);
        System.out.println("r2 = " + r2);

        System.out.println("--------------------------------------------");
        char []a3 = {'s', 'd', 'f', 'g', 'h'};
        boolean r3 = ArraysUtility.contains(a3, 'j');
        System.out.println("r3 = " + r3);

        System.out.println("----------------------------------------------");
        String [] a4 ={"Ismali", "Mali", "Rum", "Selmita"};
        boolean r4 = ArraysUtility.contains(a4, "rum");
        System.out.println("r4 = " + r4);

    }
}
