package day10_NestedIf;

public class IfStatementsWithoutCurlyBraces {

    public static void main(String[] args) {


        int number = 10;
        String result = " ";


        if (number == 1) { //two statements in one block. if there are two+, we must use curly braces.
            result = "January";
            System.out.println("January");}
        else if (number == 2) // one statement in one block. if there is one, no need to use curly braces.
            result = "February";
        else if (number == 3)
            result = "March";
        else if (number == 4)
            result = "April";
        else if (number == 5)
            result = "May";
        else if (number == 6)
            result = "June";
        else if (number == 7)
            result = "July";
        else if (number == 8)
            result = "August";
        else if (number == 9)
            result = "September";
        else if (number == 10)
            result = "October";
        else if (number == 11)
            result = "November";
        else
            result = "December";


        // if there is only one statement in a block we don't need to use curly braces,
        // but it is recommended to use it anyway.

        System.out.println("month name = " + result);

    }
}
