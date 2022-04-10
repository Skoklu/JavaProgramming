package day24_CustomMethods_Return;

public class Return_vs_ExitMethod_Months {

    public static void main(String[] args) {
        nameOfMonth(15);

        System.out.println("Hello World");
        //if we use return method in line 17, even if the given number is invalid, "Hello World" executed as well
        //however if we use System.exit() in line 17 And the given number is invalid, "hello World" is not executed, if
        // we write (0).
    }

    public static void nameOfMonth(int number){

        if (number <1 || number>12){
            System.out.println("Invalid");
           // return;  //exits nameOfMonth method, remaining code fragments of the method never gets executed
            System.exit(0);
        }

        String name = (number == 1) ? "January" : (number == 2) ? "February" : (number == 3) ? "March" : (number == 4) ? "April" :
                (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July" : (number == 8) ? "August" :
                        (number == 9) ? "September" : (number == 10) ? "October" : (number == 11) ? "November" :
                                "December";


        System.out.println("Name of the month is: "+name);

    }
}
