package day09_IfStatement;

public class NameOfDay {

    public static void main(String[] args) {


        int n = 2;  //1 ~ 7



        if (n == 1){
            System.out.println("Sunday");

        }else if (n == 2){
            System.out.println("Monday");
        }
        else if (n == 3){
           System.out.println("Tuesday");
        }
        else if (n == 4){
            System.out.println("Wednesday");
        }
        else if (n == 5){
            System.out.println("Thursday");

        }else if (n == 6){
            System.out.println("Friday");
        }
        else {
            System.out.println("Saturday");
        }


        System.out.println("--------------------------------");

        String day;

        if (n == 1){
           day = "Sunday";
        }
        else if (n == 2){
            day = "Monday";
        }
        else if (n== 3) {
            day = "Tuesday";
        }
        else if (n == 4){
            day = "Wednesday";
        }
        else if (n ==5){
            day = "Thursday";
        }
        else if (n == 6){
            day = "Friday";
        }
        else {
            day = "Sturday";
        }

        System.out.println("day = "+ day);

    }
}
