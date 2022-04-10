package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {


        int []num1 ={1,1,1,2,3,4,5,5,51,1,2,6,1,51,6};
        num1=removeDuplicate(num1);
        System.out.println(Arrays.toString(num1));

        System.out.println("-------------------------------------------------");

        double []num2={3.3, 3.3, 4.5, 4.5, 4.5, 6.5, 6.5, 7.8, 7.8,9.0};
        num2=removeDuplicate(num2);
        System.out.println(Arrays.toString(num2));

        System.out.println("------------------------------------------------------");

        char []ch={'e', 'e', 'e', 'f', 'f', 'd', 'd', 'a', 'a', 'c', 'b', 'b', 'c', 'a', };
        ch = removeDuplicate(ch);
        System.out.println(Arrays.toString(ch));

        System.out.println("------------------------------------------------");

        String []str = {"Max", "Max", "Min", "Min", "Cydeo", "Cydeo", "C#", "Java", "Python", "Python", "C#", "C#", "java", "Java"};
                str =removeDuplicate(str);
        System.out.println(Arrays.toString(str));

    }
    //removes the duplicates from the given array, returns the new array
    public static int[]removeDuplicate (int [] array){

        int []result ={};

        for (int each : array) {

            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result, each);

            }

        }
        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static double[] removeDuplicate(double []array){

        double [] result = {};

        for (double each : array) {
            if (!ArraysUtility.contains(result, each)){
                result =ArraysUtility.addElement(result, each);

            }
        }
        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static char[] removeDuplicate(char [] array){

        char[] result ={};

        for (char each : array) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result, each);

            }

        }
        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static String[] removeDuplicate(String [] array){

        String []result = {};
        for (String each : array) {
            if (!ArraysUtility.contains(result, each)){
                result =ArraysUtility.addElement(result, each);
            }

        }
        return result;
    }
}
