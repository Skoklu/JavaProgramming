package week09;

public class CombineString {

    public static void main(String[] args) {


        System.out.println(combineString("abc","defg"));

        String str = combineString("java", "fun");
        System.out.println("str = "+str);

    }

    public static String combineString (String str1, String str2){
        String combined = "";
        int biggestSize = str1.length()>str2.length()? str1.length() : str2.length();

        for (int i = 0; i < biggestSize; i++) {
            if (i < str1.length()){
                combined+=str1.charAt(i);
            }
            if (i < str2.length()){
                combined+=str2.charAt(i);
            }

        }
        return combined;
    }
}
/*
      Write a method/function that will take two String and combine them
    Ex:
        Input: "abc", "defg"
        Output: "abcdefg"

        // adbecfg

     */