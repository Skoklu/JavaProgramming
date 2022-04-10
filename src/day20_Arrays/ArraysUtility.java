package day20_Arrays;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        int []numbers = {10, 9, 0, 7, 6, 5, 7, 3, 2, 4, 8, 11};

        System.out.println(Arrays.toString(numbers));



        Arrays.sort(numbers);  //sorts the array in ascending order (from smaller to higher
        System.out.println(Arrays.toString(numbers));
    }
}
