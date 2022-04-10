package day10_NestedIf;

public class NameOfMonth2 {

    public static void main(String[] args) {

        int n = 7;

        String name = (n ==1)?  "January" :  (n ==2)?  "February" :  (n ==3)?  "March" :  (n ==4)?  "April" :
                (n ==5)?  "May" :  (n == 6)?  "June" :  (n ==7)?  "uly" :  (n ==8)?  " August" :
                        (n ==9)?  "September" :  (n ==10)?  ")ctober" :
                                (n ==11)?  "November" : "December";

        //Parenthesis are optional but makes it to read easier.

        System.out.println(name);

    }
}
