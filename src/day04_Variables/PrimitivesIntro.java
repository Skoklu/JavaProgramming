package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        // age: 38 years old. x is your age
        byte age = 38;

        // DateType VariableName = Data;
        /* Variable must be:
        -Readable
        -In CamelCase if more than one word
         */

        // weight: 160 pounds
        // byte weight = 160; 160 is out of the byte's range, it gives error.
        short weight = 160; //160 is within the range of short

        //Salary: 100000 $
        // 100000 is out of short's range
        int salary = 100_000;
        //int is the preferred data type for integer numbers
            /*
            Underscore (_) :you can use the underscore to separate numbers and make them to read easier
             like : 100_000_000
             */

        long asset = 3_333_333_333L;
        /*
        If the data is out of int's range  we have to type " L or l" at the end.
         */
        // the more memory space it takes, slower the performance is.


        // When we use decimal number we will use FLOAT or DOUBLE. But DOUBLE is more preferable.
        //However, if we use float we have to add " F "end of to number.


        // tax : 0.26;  (double)
        // tax : 0.26F;

        //double PI = 3.14


        //char is created for single character
        //#
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);  //these are the same ch1 and ch2
        
        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 45000;
        System.out.println("ch3 = " + ch3);

        char ch4 = 65000;
        System.out.println("ch4 = " + ch4);

        char ch5 = 99;
        System.out.println("ch5 = " + ch5);

        char gender = 'F';
        System.out.println("gender = " + gender);

        char grade = 'F';
        System.out.println("grade = " + grade);

        char yesNo = 'Y';
        System.out.println("yesNo = " + yesNo);
        // char ch5 = 'AB';

        boolean isEmployeed = true;
        System.out.println("isEmployeed = " + isEmployeed);

        boolean isMarried = false;
        System.out.println("isMarried = " + isMarried);

        boolean result = 100 > 300;
        System.out.println("result = " + result);

        String name = "Wooden Spoon";
        String city = "McLean";
        String state = "Virginia";
        String country = "USA";


        System.out.println("name = " + name);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("country = " + country);


        /*
        Primitives:
       -int:for integers
       - double: for decimals
       - char: for single characters
       - boolean: true/false

        String:


         */
        /*Numerical primitive:
        Double > float > long > int > short > byte
         */






    }
}
