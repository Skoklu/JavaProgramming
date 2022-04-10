package day17_While_DoWhile;

public class frequencyOfWord {

    public static void main(String[] args) {

        String str = "JavaJavaJavaJavaJava";


        int frequency =0;
        for (int i = 0; i < str.length()-3; i++) {   //i:1,2,3,4,5,6,7  // (i < str.length()-3;) = (i <= str.length()-4)
          String eachSubs = str.substring(i, i+4);

            if (eachSubs.equals("Java")){
                frequency++;

            }
        }

        System.out.println(frequency);

    }
}

/*
4. write a program that can return the frequency of the word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create


 */