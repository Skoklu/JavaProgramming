package day19_LoopPractice;

public class IndexOfDuplicate {

    public static void main(String[] args) {

        String str = "abccddddeffg";
        String result = "";

        for (int j = 0; j <str.length() ; j++) {
            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i <str.length() ; i++) {
                char eachChar = str.charAt(i);
                if (ch == eachChar) {
                    count++;
                }
            }

            if (count >=2){
                result +=ch;
            }

        }
        System.out.println(str.indexOf(result.substring(0,1)));
    }
}
//2. Write a program that can return the index number of the first duplicated character from a string