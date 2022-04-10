package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {

       String str = "Cydeo12345School!  @#$%WoodenSpoon";

       String digits = "";
       String letters = "";
       String specialChars = "";

        for (int i = 0; i < str.length(); i++) {  //i: index number of str (0 ~ last index )

            char ch = str.charAt(i);  //ch: each character that we have in str

            if (ch >='0' && ch <='9'){  //if the character between '0' to '9' then it's digit
                digits += ch;
            }else if (ch >='a' && ch <= 'z'|| ch >= 'A' && ch <= 'Z') {  //if the character between 'a''A' to 'z''Z' to '9' then it's letter
                letters += ch;
            }else {
                if (ch != ' ') {//if the character is neither digit nor letter, then it's special character
                    specialChars += ch;
                
                }
            }
        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);
    }
}
