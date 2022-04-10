package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElement {

    public static void main(String[] args) {
        int []arr1 ={1,1,1,1,1,2,3,3,3,4,5,5,5,6};
        int[]unique = uniqueElement(arr1);
        System.out.println(Arrays.toString(unique));

        System.out.println("----------------------------------------");

        double [] arr2 = {1.5, 2.5, 4.5, 1.5, 3.5, 5.5, 5.5};
        double []unique2 = uniqueElement(arr2);
        System.out.println(Arrays.toString(unique2));

        System.out.println("-------------------------------------------");

        char[] arr3 = {'A', 'C', 'F', 'C', 'Z', 'Z', 'W', 'S', 'S', 'G', 'B', 'G', 'C', 'B', };
        char[]unique3 =uniqueElement(arr3);
        System.out.println(Arrays.toString(unique3));

        System.out.println("----------------------------------------------");

        String []arr4 ={"Java", "Java", "Spoon", "Python", "Python", "C#", "C#", "School", "School", "Cydeo"};
        String []unique4 =uniqueElement(arr4);
        System.out.println(Arrays.toString(unique4));
    }

//returns the unique elements of the array as a new array
    public static int []uniqueElement (int []array){

        int[]result = {};  //new int[0]
        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array,each)==1){  //if the frequency is one, the element is unique
              result =  ArraysUtility.addElement(result, each);
            }

        }
        return result;
    }

    //returns the unique elements of the array as a new array
    public static double[]uniqueElement(double[]array){

        double result[]={};

        for (double each : array) {

            if (ArraysUtility.frequencyOfElement(array, each)==1){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //returns the unique elements of the array as a new array
    public static char[] uniqueElement(char[]array){
      char []result ={};

        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array,each)==1) {
                result = ArraysUtility.addElement(result, each);

            }
        }
        return result;
    }

    //returns the unique elements of the array as a new array
    public static String [] uniqueElement(String[]array){
        String[] result ={};

        for (String each : array) {
          if (ArraysUtility.frequencyOfElement(array,each)==1){
              result = ArraysUtility.addElement(result, each);
          }

        }
        return result;
    }
}
