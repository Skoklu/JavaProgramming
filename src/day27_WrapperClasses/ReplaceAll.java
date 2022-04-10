package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {

    public static void main(String[] args) {

        int []num1= {10, 20, 30, 30, 10, 10, 40, 50, 10};
        num1=replaceAll(num1,10,100);
        System.out.println(Arrays.toString(num1));

        System.out.println("-------------------------------------------");

        double[]num2 ={5.4, 4.6, 8.6, 4.6, 3.8, 4.6, 4.6};
        num2=replaceAll(num2,4.6,460.0);
        System.out.println(Arrays.toString(num2));

        System.out.println("---------------------------------------------");

        char []ch = {'a', 'd', 'b', 'a', 'c', 'a', 'c', 'a', 'c', 'a', 'c', 'a'};
        ch= replaceAll(ch,'a','*');
        System.out.println(Arrays.toString(ch));

        System.out.println("-------------------------------------------------");

        String []str ={"C#", "Java", "School", "C#", "Spoon", "Wooden", "C#", "Python", "Java", "C#", "Java"};
                str=replaceAll(str,"C#","@@");
        System.out.println(Arrays.toString(str));

    }
    //replace all the matching old values of the array with the new value
    public static int []replaceAll(int[]array, int oldValue, int newValue){

        for (int i = 0; i < array.length; i++) {

            if (array[i]==oldValue){
                array[i]=newValue;
            }

        }
        return array;
    }

    //replace all the matching old values of the array with the new value
    public static double[]replaceAll(double[] array, double oldValue, double newValue){
        for (int i = 0; i < array.length; i++) {

            if (array[i]==oldValue){
                array[i]=newValue;
            }

        }
        return array;
    }

    //replace all the matching old values of the array with the new value
    public static char[]replaceAll(char[]array, char oldValue, char newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldValue){
                array[i]=newValue;

            }

        }
        return array;
    }

    //replace all the matching old values of the array with the new value
    public static String[]replaceAll(String[]array, String oldValue, String newValue){

        for (int i = 0; i < array.length; i++) {

            if (array[i].equals(oldValue)){
                array[i]=newValue;

            }

        }
        return array;
    }
}
