package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class MethodOverLoading {

    public static void main(String[] args) {

        int[] intArray = {5, 6, 0, -1, 3, 4};
        Arrays.sort(intArray);

        double[] doubleArray = {10.5, 11.5, 5.5, 4.5};
        Arrays.sort(doubleArray);

        char[] charArray = {'E', 'F', 'B', 'D', 'C', 'A'};
        Arrays.sort(charArray);

        System.out.println("--------------------------------------------------");
        // sum of 10 and 20
        int sum = sumOfNumbers(10, 20);

        //sum of 10, 20, 30,
        int sum2 = sumOfNumbers(10, 20, 30);

        //sum of 10, 20, 30, 40
        int sum3 = sumOfNumbers(10, 20, 30, 40);

        //sum of 18.2, 30.7
        double sum4 = sumOfNumbers(18.2, 30.7);

        //sum of 5.5, 6.5, 4.5
        double sum5 = sumOfNumbers(5.5, 6.5, 4.5);

        //sum of 4.5, 3.5, 2.5, 6.5
        double sum6 = sumOfNumbers(4.5, 3.5, 2.5, 6.5);





    }

    public static double sumOfNumbers(double num1, double num2) {
        return num1 + num2;
    }
    public static int sumOfNumbers(int num1, int num2) {
        return num1 + num2;
    }
    

    public static int sumOfNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    public static double sumOfNumbers(double num1, double num2, double num3) {
        return num1 + num2 + num3;

    }
    public static int sumOfNumbers (int num1, int num2, int num3, int num4){
        return sumOfNumbers(num1, num2, num3) + num4;  //different writing of return
}

    public static double sumOfNumbers (double num1, double num2, double num3, double num4) {
        return sumOfNumbers(num1, num2, num3) + num4;  //different writing of return
    }
}

/*
Task1:
	    1. create a method that can find the sum of two numbers
	                    method name: sumOf2Numbers

	    2. create a method that can find the sum of three numbers
	                    method name: sumOf3Numbers

	    3. create a method that can find the sum of four numbers
	                    method name: sumOf4Numbers

	Task2:
		1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array

					{1,2,3,4}, 5
					new array ==> {1,2,3,4,5}

	    2. create a return method called addDouble that can add a double after the last index of a double array

	    3. create a return method called addString that can add a String after the last index of a String array

	    4. create a return method called addChar that can add a char after last index of a char array


 */