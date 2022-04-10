package day12_Scanner;

public class GradeLevel {

    public static void main(String[] args) {

        int num = 23;
        String result ="";

        switch (num){
            case 1: case 2: case 3: case 4: case 5:
                result=("Elementary School");
                break;
            case 6: case 7: case 8:
                result = ("Middle School");
                break;
            case 9: case 10: case 11: case 12:
                result = ("High School");
            case 13: case 14: case 15: case 16:
                    result = ("College");
                    break;
            case 17: case 18:
                result += ("Grad School");
                break;
            default:
                result=("Invalid grade level given");


        }

        System.out.println(result);


        System.out.println("---------------------------------------------");


        int num2 = 1;
        String result2="";

        if (num2 >= 1 && num2 <=18){   //1~ 18:  case: 6 ~ 18, Default: 1~5
            switch (num2){

                case 6: case  7: case 8:
                    result2 = ("Middle School");
                            break;
                case 9: case 10: case 11: case 12:
                    result2= ("High School");
                    break;
                case 13:  case 14: case 15: case 16:
                    result2 = ("College");
                    break;
                case 17: case 18:
                    result2= ("Grad School");
                    break;
                default:
                    result2= ("Elementary School");
            }
        }else{
            result2 =("Invalid Grade Level");
        }
        System.out.println(result2);



        }
}
