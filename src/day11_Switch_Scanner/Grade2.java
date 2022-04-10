package day11_Switch_Scanner;

public class Grade2 {

    public static void main(String[] args) {

        char ch = 'Y';
        String result =" ";

        switch (ch){
                //you can write like:  case 'A':  case 'B':   case 'C':   case 'D':
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                result="Passed";
                break;
            case 'F':
                result = "Failed";
            default:
                result = "Invalid";




        }
        System.out.println(result);


    }
}
/*if the grade is A or B or C or D or ====>Passed
Otherwise ===>Failed

 */