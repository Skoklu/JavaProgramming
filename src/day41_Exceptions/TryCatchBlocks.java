package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {

    public static void main(String[] args) {

        //UNCHECKED EXCEPTIONS

        System.out.println("Test started");

        try{   //if the exception is occurred in  compile time try block is executed
            System.out.println(9/0);

            System.out.println("Try block");
        }catch (ArithmeticException e){  //if the exception is occurred in runtime catch block is executed
            System.out.println("Catch block");
            System.out.println("Arithmetic Exception was occurred");
        }
        System.out.println("Test Completed");

        System.out.println("-------------------------------------------");

        System.out.println("Test2 started");

        int[] numbers = {1,2,3,4,5};

        try{
            System.out.println(numbers[200]);

            System.out.println("Try block");

        }catch (RuntimeException e){  //if you don't know which exception is you should put "RuntimeException"

            //System.out.println("Catch block");

            //System.out.println("RuntimeException was occurred");
            //e.printStackTrace();   //this is give you full details of exceptions if it is runtime exception
            System.out.println(e.getMessage());   //give a short exception us if it is runtime exception
        }

        System.out.println("Test2 Completed");

        System.out.println("----------------------------------------------------");

        System.out.println("Test 3 started");

        try{
            System.out.println("Cydeo".substring(2,0));
        }catch (RuntimeException e){
            e.printStackTrace();
        }


        System.out.println("---------------------------------------");

        // CHECKED EXCEPTIONS


        System.out.println("Test4 Started");

        System.out.println("Hello");

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();


        }
        System.out.println("Cydeo");

        System.out.println("----------------------------------------------");

       // FileInputStream file = new FileInputStream("File path");  // when you write this code it-->
        // is giving you compile error and the sysytem give you solution ways automatically like under
        try {
            FileInputStream file = new FileInputStream("File path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
