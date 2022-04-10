package day19_LoopPractice;

public class UniqueCharacter {

    public static void main(String[] args) {

      String str = "aabccdeefaaa";
      String result ="";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;  //represents the frequency of the char



            for (int i = 0; i < str.length(); i++) {  //Compares the character that outer loop pick, -->
                                                        // with each character of the String
                char eachChar = str.charAt(i);//each character of str

                if (ch == eachChar){
                    count++;

                }
        }
           // if (count ==1){    //if the frequency of the character is 1, then the character is unique
               // result += ch;

            if (count != 1){
                continue;
            }
            result +=ch;
        }
        System.out.println(result);

    }
}
/*
2. Write a program that can find the unique characters from a string without using indexOf() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

 */