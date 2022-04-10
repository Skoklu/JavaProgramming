package day19_LoopPractice;

public class DuplicateChar {

    public static void main(String[] args) {


        String str = "abbbbccdeefg";
        String result = "";

        for (int j = 0; j < str.length(); j++) {


        char ch = str.charAt(j);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);

            if (ch == eachChar) {
                count++;


            }

            }
            if (count>=2){
               result +=ch;
            }
        }

        System.out.println(result.substring(0,1));


    }
}
//1. Write a program that can return the first duplicated character from a string