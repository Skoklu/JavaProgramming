package day20_Arrays;

import java.util.Arrays;

public class NameOfTheMonths {

    public static void main(String[] args) {

       String [] month ={"January", "February", "March", "April", "May", "June", "July",
               "August", "September", "October", "November", "December"};

        for (int i = 0; i < month.length; i++) {  // i is represents the index numbers of array starting from 0

            System.out.println(month[i]);

        }
        /*                                                  OR
        System.out.println(month[0] +"\n"+month[1] +"\n"+month[2] +"\n"+month[3] +"\n"+month[4] +"\n"+month[5]
                +"\n"+month[6] +"\n"+month[7] +"\n"+month[8] +"\n"+ month[8] +"\n"+month[10] +"\n"+month[11]);

         */


        System.out.println("--------------------------------------------------");

        for (int i = month.length -1; i >=0 ; i--) {  //i : represents the index numbers of array --->
            // starting from last index
            System.out.println(month[i]);

        }



    }
}
