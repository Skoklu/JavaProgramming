package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {

    public static void main(String[] args) {

      int []arr1 = {1,2,3,4,5,6};
      arr1=replace(arr1,2,30);
        System.out.println(Arrays.toString(arr1));

        System.out.println("----------------------------------------------------");

        double[]arr2 = {1.2, 2.3, 3.4, 4.5, 5.6};
        arr2 = replace(arr2,3,10.5);
        System.out.println(Arrays.toString(arr2));

        System.out.println("-----------------------------------------------------");

        char []arr3= {'a', 't', 'y', 'n', 'u', 'n', 'j', 'a', 'a'};
        arr3=replace(arr3,3,'#');
        System.out.println(Arrays.toString(arr3));

        System.out.println("----------------------------------------------------");

        String[]arr4={"Java", "Cydeo", "School", "C#", "Wooden"};
        arr4= replace(arr4,2,"**");
        System.out.println(Arrays.toString(arr4));

    }

    //replaces the elements of the array at given index, with the new given element
    public static int[] replace(int []array,int index, int newElement){

        if (index<0 || index> array.length-1){
            System.err.println("Invalid entry");
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }

    //replaces the elements of the array at given index, with the new given element
    public static double []replace(double[]array, int index, double newElement){

        if (index<0 || index>array.length-1){
            System.err.println("Invalid entry");
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }

    //replaces the elements of the array at given index, with the new given element
    public static char []replace(char[]array, int index, char newElement){

        if (index<0 || index>array.length-1){
            System.err.println("Invalid entry");
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }

    //replaces the elements of the array at given index, with the new given element
    public static String []replace(String[]array, int index, String newElement){

        if (index<0 || index>array.length-1){
            System.err.println("Invalid entry");
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }

}
