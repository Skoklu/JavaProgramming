package day42_Exceptions;

public class ThrowsKeyword2 {

    public static void main(String[] args) throws ArithmeticException{

        System.out.println("Test started");

        System.out.println(8/0);  //throws keyword not handling the exception, because you can not use it for "Unchecked Exception".

        System.out.println("Test completed");
    }
}
