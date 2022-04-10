package day20_Arrays;

import java.util.Arrays;

public class HundredToOne {

    public static void main(String[] args) {

        int number[] = new int [100];

        for (int i =0, j = 100; i < number.length&& j>0; i++,j--) {
            number[i]=j;

        }
        System.out.println(Arrays.toString(number));
    }
}
