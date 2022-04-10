package day20_Arrays;

public class MinimumNumberOfArray {

    public static void main(String[] args) {

        int []numbers = { 13, 24, 11, 98, 5, 45, 3};
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i]< min){  // if there is an element in the array that's smaller
                min = numbers[i];  //smaller number will be assigned to the variable
            }


        }
        System.out.println(min);


    }
}
