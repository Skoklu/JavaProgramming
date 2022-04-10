package day12_Scanner;

//import java.util.*;  //wild import: imports everything from the package,and it takes more memory

import day07_Operators.Casting;

import java.util.Scanner;   //Regular import: if we put the "Scanner" it is import only scanner class

public class ScannerIntro {

    public static void main(String[] args) {


         /*
        new Scanner(System.in).nextInt();
        new Scanner(System.in).nextInt();
        .........
        if we do like this. system would use more memory
         */


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 1 to 7: ");

       // byte num = (byte) scan.nextInt(); (Exclusive Casting)  OR you can use  next option, it is better
        int num = scan.nextInt();
        String result = "";

        if(num >=1 && num <=7){
            result= (num ==1)? "Monday": (num==2)? "Tuesday": (num==3)? "Wednesday":
                    (num==4 )? "Thursday": (num==5)? "Friday": (num==6)? "Saturday": "Sunday";

        }else {
            result= "Invalid number";
        }
        System.out.println(result);
        scan.close();






    }
}
