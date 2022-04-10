package day26_CustomMethodsPractice;

public class FrequencyOfElement {

    public static void main(String[] args) {
        int []arr ={1,1,1,1,1,1,2,2,2,4,4,4,4,7,7,7,7,1,1,1};
        int n1 = frequencyOfElement(arr,1);
        System.out.println(n1);

        System.out.println("-------------------------------------------");

        double [] arr2 ={2.3, 3.4, 4.5,4.5,4.5,4.5,4.5,4.5,4.5, 5.6, 5.6,5.6,5.6,6.7};
        int n2 =frequencyOfElement(arr2,4.5);
        System.out.println(n2);

        System.out.println("------------------------------------------------");

        char []arr3 ={'A', 'A', 'A', 'A', 'A', 'A', 'B', 'B', 'B', 'C', 'C', 'C', 'C', 'C', 'C', };
        int n3= frequencyOfElement(arr3,'A');
        System.out.println(n3);

        System.out.println("------------------------------------------------");

        String[]arr4 = {"Java", "Java", "Java", "Java", "Java", "Java", "Python", "Python", "Python", "C#"};
        int n4 = frequencyOfElement(arr4,"Java");
        System.out.println(n4);

    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[] array, int element){

        int count =0;

        for (int each : array) {
            if (each == element){
                count++;
            }

        }
        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(double[]array, double element){
        int count =0;
        for (double each : array) {
            if (each == element){
                count++;

            }

        }
        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(char[]array, char element){
        int count =0;

        for (char each : array) {
            if (each==element){
                count++;
            }

        }
        return count;
    }

   //returns the frequency of the given element from the given array
    public static int frequencyOfElement(String[]array, String element){

        int count = 0;
        for (String each : array) {
            if (each.equals(element)){
                count++;

            }

        }
        return count;
    }
}
/*
warmup tasks:
	1. Create a class named FrequencyOfElement:
			1.1 Create a method that passes two parameters: an integer array and an Integer element. The method returns the frequency of the given integer element from the integer array

			1.2 Create a method that passes two parameters: a double array and a double element. The method returns the frequency of the given integer from the array

			1.3 Create a method that passes two parameters: a char array and a char element. The method returns the frequency of the given char element from the char array

			1.4 Create a method that passes two parameters: a String array and a String element. The method returns the frequency of the given String element from the String array

 */