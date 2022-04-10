package day17_While_DoWhile;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        String str = "AAABBBCCCCCAAA";
        char ch = 'A';
        int frequency =0;  //1+1+1+1+1+1

        for (int i = 0; i < str.length() ; i++) {  //i : index of str
            char eachChar = str.charAt(i);  //eachChar : each character of str

            if (ch == eachChar){  //if given ch is matching with the eachChar, then ch is appeared in the string
                frequency += 1;  //(frequency +=1;) = (frequency++;)
            }


        }
        System.out.println(frequency);
    }
}
/*
2. Write a program that asks user to entera string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */