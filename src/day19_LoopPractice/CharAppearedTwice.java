package day19_LoopPractice;

public class CharAppearedTwice {

    public static void main(String[] args) {

        String str = "aabccdeeeffg";
        String result = "";


        for (int j = 0; j <str.length() ; j++) {

        char ch= str.charAt(j);
        int count = 0;


        for (int i = 0; i <str.length() ; i++) {
            char eachChar = str.charAt(i);

            if (ch == eachChar) {
                count++;
            }
        }
        if (count == 2)
            result +=ch;
        }
        System.out.println(result);

    }
}
//3. Write a program that can display all the characters that appeared twice in the string.