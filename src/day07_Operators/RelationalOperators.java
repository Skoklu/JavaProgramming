package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {

        //>, >=, <, <=

        boolean result1 = 200 > 40;

        System.out.println("result1 = " + result1);  //true

        boolean result2 = 300 >= 150;

        System.out.println("result2 = " + result2);   ///true

        boolean result3 = 100 >= 100;

        System.out.println("result3 = " + result3);   //true

        boolean result4 = 300>=500;

        System.out.println("result4 = " + result4);  //false

        //credit score of 720

        int creditScore = 745;

        boolean isEligibleForLoan = creditScore >= 720;//if the credit score is 720 or grater, then it is eligible for loan

        System.out.println("isEligibleForLoan = " + isEligibleForLoan);

        boolean result5 = 100 <120;  //true
        System.out.println("result5 = " + result5);

        boolean result6 = 200 < 180;   //false

        System.out.println("result6 = " + result6);

        int score = 75;
        boolean hasFailed = score <= 59;  //false

        System.out.println("hasFailed = " + hasFailed);

        boolean result7 = 45 <= 60;

        System.out.println("result7 = " + result7);

        // you cannot use String for the first 4 relational operators !!!!!


        System.out.println("----------------------------------------");


        //EQUAL

        int x = 100;
        int y = 200;

        boolean equal = x == y;   //false
         //             100==200

        System.out.println("equal = " + equal);

        boolean result8 = "Muhtar"  == "Good Guy";  //false

        System.out.println("result8 = " + result8);

        boolean result9 = 'A' == 'a';//false

        System.out.println("result9 = " + result9);

        boolean result10 = "Java" == "Java";   //true

        System.out.println("result10 = " + result10);

        //"Hello World"  ==  "hello world";==>false

        System.out.println("----------------------------");

        boolean result11 = 100 != 200.5;  //true

        System.out.println("result11 = " + result11);

        boolean result12 = "Java" != "Break";

        boolean result13 =  300 != 300; //false

        System.out.println("result13 = " + result13);

        /*
        Operators:
	+, -, *, /, %
	++, --
	=, +=, -=
	>, <, >=, <=, ==, !=

         */















    }
}
