package day26_CustomMethodsPractice;



import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArray1 {

    public static void main(String[] args) {
        int arr1[] ={1,2,3,4,5};
        int []arr2 = {6,7,8,9,10};
        int []newAr = merge(arr1,arr2);
        System.out.println(Arrays.toString(newAr));

        System.out.println("-----------------------------------");

        double [] arr3 ={1.2, 2.3, 3.4, 4.5, 5.6};
        double [] arr4 ={6.7, 7.8, 8.9, 9.0, 1.9};
        double[]newAr2 =merge(arr3,arr4);
        System.out.println(Arrays.toString(newAr2));

        System.out.println("------------------------------------------------");

        char[]ch1 ={'A', 'S', 'D', 'F', 'G', 'H', 'J'};
        char[]ch2 ={'Q', 'W', 'E', 'R', 'T', 'Y'};
        char[]ch3 =merge(ch1, ch2);
        System.out.println(Arrays.toString(ch3));

        System.out.println("-------------------------------------------------");

        String [] str1 = {"Ali", "Nur", "Gul", "Mine", "Jale", "Hadi", "Sami"};
        String [] str2 = {"Veli", "Ayse", "Salih", "Oya", "Leman", "Nuran", "Narin"};
        String [] str3 =merge(str1, str2);
        System.out.println(Arrays.toString(str3));
    }
    
    //merge two given arrays and returns the new array
  public static int []merge (int[]arr1, int []arr2){
      int result[]={};
      for (int each : arr1) {
          result= ArraysUtility.addElement(result, each);

      }
      for (int each : arr2) {
          result= ArraysUtility.addElement(result,each);

      }
      return result;
  }

    //merge two given arrays and returns the new array
  public static double []merge(double[]arr1, double[]arr2){
        double [] result={};

      for (double each : arr1) {
         result= ArraysUtility.addElement(result, each);
      }
      for (double each : arr2) {
         result =ArraysUtility.addElement(result, each);


      }
      return result;
  }

    //merge two given arrays and returns the new array
    public static char []merge(char[]arr1, char[]arr2){
        char [] result={};

        for (char each : arr1) {
            result= ArraysUtility.addElement(result, each);
        }
        for (char each : arr2) {
            result =ArraysUtility.addElement(result, each);
        }
        return result;
    }

    //merge two given arrays and returns the new array
    public static String []merge(String[]arr1, String[]arr2){
        String [] result={};

        for (String each : arr1) {
            result= ArraysUtility.addElement(result, each);
        }
        for (String each : arr2) {
            result =ArraysUtility.addElement(result, each);
        }
        return result;
    }
}
