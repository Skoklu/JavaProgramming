package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {

    public static void main(String[] args) {

        String[]student = {"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron", "Daniel"};

        String []earlyBird = Arrays.copyOf(student, student.length);
        System.out.println(Arrays.toString(earlyBird));

        String []earlyBird2 = Arrays.copyOf(student, 3);
        System.out.println(Arrays.toString(earlyBird2));

        System.out.println("---------------------number-----------------------------");

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        numbers = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(numbers));


        System.out.println("----------------------------------------------------------");

        char[]ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        char[]ch2 = Arrays.copyOfRange(ch1, 2,6);

        System.out.println(Arrays.toString(ch2));

        int[]score = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        //index        0   1   2   3   4   5   6   7   8   9

        int [] result = Arrays.copyOfRange(score, 3, 8);

        System.out.println(Arrays.toString(result));

      int []result2 = Arrays.copyOfRange(score, 4,score.length);

        System.out.println(Arrays.toString(result2));



    }
}
