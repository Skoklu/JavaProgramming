package day24_CustomMethods_Return;

public class ReturnMethodsPractice2_Grade {
    public static void main(String[] args) {

//Create a function that can calculate the grade
        String str1 = grade(95);

        /*
    check the grade:
                "A"===>excellent
                "B"===>great
                .......
     */
        String result2 ="";
        if (str1.equals("A")){
            result2 ="Excellent";
        }else if (str1.equals("B")){
            result2 = "Great";
        }else if (str1.equals("C")){
            result2 = "Good";
        }else if (str1.equals("D")){
            result2 = "Passed";
        }else{
            System.out.println("Try again1");
        }
        System.out.println(result2);
    }



    public static String grade(int score){

        String result = "";
        if (score<0 || score > 100){  //invalid
            result="Invalid";
        }else {  //valid

            result=(score>=90)?"A": (score>=80)?"B": (score>=70)?"C": (score>=90)?"D": "F";

        }
        return result;
    }
}
