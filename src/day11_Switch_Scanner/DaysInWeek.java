package day11_Switch_Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        int number =7;

        /*
        Switch' Data can not be:
        -boolean
        -double
        -float
        -long data type

         Case value must match with switch' data type and UNIQUE

       Break: used for existing the switch.
       if we don't give the break statement, switch statement continue to execute the next block(s)
       until the break statement or} of the switch.
       Default block gets executed if none of the case blocks matched.

       there can only be one default block.
         */

        switch (number){   //1, 2, 3, 4, 5, 6, 7,
            case 1:
                System.out.println("Monday");
                break;   //exits the switch after executing the case block

            case 2:
                System.out.println("Tuesday");
                break;   //exits the switch after executing the case block

            case 3:
                System.out.println("Wednesday");
                break;   //exits the switch after executing the case block

            case 4:
                System.out.println("Thursday");
                break;   //exits the switch after executing the case block

            case 5:
                System.out.println("Friday");
                 break;   //exits the switch after executing the case block

            case 6:
                System.out.println("Saturday");
                break;   //exits the switch after executing the case block

            case 7:
                System.out.println("Sunday");
                break;   //exits the switch after executing the case block

            default:   //only gets executed if none of the case blocks are matching and you can place anywhere
                System.out.println("Invalid");
                break;   //the last break optional,so we don't need to put break statement, because there is curly braces after default


        }

    }
}
