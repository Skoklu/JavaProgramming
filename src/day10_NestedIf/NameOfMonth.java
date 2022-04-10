package day10_NestedIf;

public class NameOfMonth {

    public static void main(String[] args) {

        int number = 15;

        if (number >= 1 && number <= 12) {

            if (number == 1) {
                System.out.println("January");
            } else if (number == 2) {
                System.out.println("February");
            } else if (number == 3) {
                System.out.println("March");
            } else if (number == 4) {
                System.out.println("April");
            } else if (number == 5) {
                System.out.println("May");
            } else if (number == 6) {
                System.out.println("June");
            } else if (number == 7) {
                System.out.println("July");
            } else if (number == 8) {
                System.out.println("August");
            } else if (number == 9) {
                System.out.println("September");
            } else if (number == 10) {
                System.out.println("October");
            } else if (number == 11) {
                System.out.println("November");
            } else {
                System.out.println("December");
            }

        } else {
            System.out.println("invalid number");
        }

        System.out.println("--------------------OR-------------------------");


        int number2 = 12;

        String result = "";   //temporary

        if (number2 >= 1 && number2 <= 12) {   //if the number is valid ( 1 ~ 12 )

            if (number2 == 1) {
                result = "January";
            } else if (number2 == 2) {
                result = "February";
            } else if (number2 == 3) {
                result = "March";
            } else if (number2 == 4) {
                result = "April";
            } else if (number2 == 5) {
                result = "May";
            } else if (number2 == 6) {
                result = "June";
            } else if (number2 == 7) {
                result = "July";
            } else if (number2 == 8) {
                result = "August";
            } else if (number2 == 9) {
                result = "September";
            } else if (number2 == 10) {
                result = "October";
            } else if (number2 == 11) {
                result = "November";
            } else {
                result = "December";
            }


        }else{   // if the number is not valid
                result = "invalid number";

            }
            System.out.println(result);


        }
    }



