package week05;

import java.util.Scanner;

public class ReplitQuizQuestion {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is thr farthest planet in the solar system");

        System.out.println("a)venus");
        System.out.println("b)Pluto");
        System.out.println("c)neptune");
        String result = input.next();


        /*switch (result){

            case "a":
                result = "a is wrong";
                break;
            case "b":
                result = "b is correct";
                break;
            case "c":
                result = "c is wrong";
                break;
            default:
                result= "is not a valid answer";



        }
        System.out.println(result);*/



input.close();


            }
        }