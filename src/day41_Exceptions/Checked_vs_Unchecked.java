package day41_Exceptions;


import day39_Recap.cydeoTask.Student;

import java.io.FileInputStream;

public class Checked_vs_Unchecked {
    public static void main(String[] args) {
        // unchecked exception:

        int a =10;
        int b = 0;


        System.out.println("Wooden Spoon");  //this line will be executed
        //System.out.println(a / b);  //  "Arithmetic exception" unchecked exception this line,because any number does not divide by 0
        //System.out.println("Wooden spoon"); //this not be printed, because the program --->
        // crashed by unchecked exception in line 10

        char []ch = {'A','B','C'};
        //            1   2   3
        // System.out.println(ch[99]);//out of bound exception


        Student student =null;
        System.out.println(student.getName());
        student.study();

        String str ="Wooden Spoon";
        str = null;  //Garbage collector

        System.out.println(str.toUpperCase());


        String str2 ="";  //object != null
        System.out.println(str2.isEmpty());  //true
        System.out.println(str2 == null);


        //Checked Exception

        System.out.println("Hello");

        // Thread.sleep(3000);  //interrupted exception

        System.out.println("Cydeo");


        //FileInputStream file = new FileInputStream("Path of the file");  //file not found exception

        System.out.println("Java".charAt(145));   //unchecked exception




    }
}
