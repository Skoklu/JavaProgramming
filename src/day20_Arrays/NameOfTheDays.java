package day20_Arrays;

import java.util.Arrays;

public class NameOfTheDays {

    public static void main(String[] args) {



        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
                //Index :   0           1           2           3           4       5           6
        System.out.println(Arrays.toString(days));

        int num =5;

        if (num <1 || num >7){
            System.err.println("Invalid number");
            System.exit(0);
        }

        System.out.println(days[num - 1]);


    }
}
