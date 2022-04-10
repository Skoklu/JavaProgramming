package day11_Switch_Scanner;

public class NumberOfDaysMixStatement {

    public static void main(String[] args) {
        int year = 2000;
        int number = 7;
        String result = "";

        if (number>=1 && number <= 12){

            switch (number){

                case 2:
                    result = (year % 4 ==0)? "29 Days" : "28 Days";
                    break;

                case 4: case 6: case 9: case 11:
                    result= "30 Days";
                    break;

                default:   //1, 3, 5, 7, 8, 10, 12
                    result = "31 Days";
            }

        }else {
            result ="Invalid Number";
        }
        System.out.println(result);

    }
}
 /*
        Number of the  days
        28 Days: 2
        30 Days: 4, 6, 9, 11
        31 Days: 1, 3, 5, 7, 8, 10, 12
        if(1~12){
        }else{
        invalid
        }
         */

// you don't use the or logic " || "