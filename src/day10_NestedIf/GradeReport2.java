package day10_NestedIf;

public class GradeReport2 {

    public static void main(String[] args) {

         /*
        90 ~ 100: Excellent
        80 ~ 89: Great
        70 ~ 79:Good
        60 ~ 69:Passed
        0 ~ 59: Failed
         */


        int  s = 135;

        String result = (s >= 0 && s <= 100)? (s >=90 && s <= 100)? "Excellent"  :  (s >=80 && s <= 89)? "Great"  :
                (s >=70 && s <= 79)? "Good"  :  (s >=60 && s <= 69)? "Passed"  : "Failed" :  "Invalid";

        System.out.println(result);

        //                              Or

        System.out.println("--------------------------------------");

        String result2 = "";

        if (s >= 0 && s <= 100){   //if the s is valid  (0 ~ 100)

            result2 = (s >= 90) ? " Excellent"  : (s >= 80 )? "Great"  : (s >= 70 )? " Good" :
                    (s >= 60)? "Passed" : "Failed" ;

        } else  {
            result2 = "Invalid";

            System.out.println(result2);
        }
    }
}
                                 // OR
/*int score = 91;

        if(score >= 0 && score <= 100){   //If the score is valid
            //5Possibilities : A, B, C, D, F

            if (score >=90 ) {    // false : score <90
                System.out.println("Score is Excellent");
            }else if (score >=80) {    //false : score <80
                System.out.println("Score is Great");
            }else if (score >=70) {//false score < 70
                System.out.println("Score is Good");
            }else if (score >=60) {   // False:score <60
                System.out.println("Score is Passed");
            }else {
                System.out.println("Failed");
            }
             }else {   //If the score is NOT valid
            System.out.println("Score is not valid");


        }
        }
        */



