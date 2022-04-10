package day10_NestedIf;

public class NumberToWord {

    public static void main(String[] args) {


        int num1 = 8;
        String word = "";

        if (num1 >=0  &&  num1 <= 9){

            if (num1 == 1){
                word = "one";
            }
            else if (num1 == 2){
                word = "two";

            }
            else if (num1 == 3){
                word = "three";

            }else if (num1 == 4){
                word = "four";

            }else if (num1 == 5){
                word = "five";

            }else if (num1 == 6){
                word = "six";

            }else if (num1 == 7){
                word = "Seven";

            }else if (num1 == 8){
                word = "Eight";

            }
            else {
                word = "nine";
            }

        }
        else{
            word = "invalid";

        }
        System.out.println("Word: "+ word);
    }
}
