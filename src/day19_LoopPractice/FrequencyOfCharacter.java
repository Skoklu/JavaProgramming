package day19_LoopPractice;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        String str = "aaaabbbbcccdddddddaaa";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                char eachChar = str.charAt(j);


                if (ch == eachChar){
                    count++;
                }


            }
            if (result.contains(""+ ch)){
                continue;
            }
            result+=ch;
            result +=count;
        }
        System.out.println(result);
    }
}
/*
1.(+) Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


 */