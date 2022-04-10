package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println("12"+1);  //121 concatenation

        System.out.println(10 + 20);  //30, Addition
        System.out.println(100 - 50);  //50, Subtraction
        System.out.println(10 * 6);    //60, multiplication


        System.out.println(100 / 3);    //33
        System.out.println(10 / 4);     //2

        System.out.println((double) 10 / 4);   //2.5
        System.out.println(10.0 / 4);     // 2.5
        System.out.println(10 / 4.0);    //2.5
        System.out.println(10d / 4);   //2.5

        int a = 100;
        double b = a/6;   //16.0
        //double b = 16;


        System.out.println(b);


        double c = a/6.0; //16.666666
        //double c = (double) a/6;    16.666666
        //double c = a/6d;    //16.6666


        System.out.println(c);

        System.out.println(100D);

        System.out.println(10 % 4);
        System.out.println(20 % 5);
        System.out.println(20 % 6);


    }


}
/*
    +:Addition
    -:Subtraction
    *:Multiplication
    /:Division
    %:Remainder

    in math:   10/ 4 = 2.5;

    remainder : numerator (denominator * integer result)

        10      -   ( 4 * 2 )
        10      -   8
        2

        20 / 6 = 3.33333
        remainder : 20 - ( 6 * 3)
                    20 - 18
                    2

    integer / integer =======>integer
    decimal / integer ======> decimal
    integer / decimal ======> decimal
    decimal / decimal ======> decimal
            in math: 10/4 = 2.5
                    100 / 3 = 33.3333333

            in JAVA  : 10/4 = 2
                       10.0/4 = 2.5
                       100 / 3 = 33

 */