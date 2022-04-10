package day14_String;
import java.lang.String;
public class StringMethod3_Substring {

    public static void main(String[] args) {

        //substring(beginning index and Ending Index)

        String word = "Cydeo School";
        //             012345

        String brand = word.substring(0, 4+1);
        System.out.println(brand);

        String str1 = word.substring(6);
        System.out.println(str1);

        System.out.println("--------------------------------------");

        String word2 = "Java programming Language";

        String s1 = word2.substring(0, word2.indexOf(" "));  //"Java"
        String s2 = word2.substring(word2.indexOf(" ") +1, word2.lastIndexOf(" ") );  //"Programming"
        String s3 = word2.substring( word2.lastIndexOf(" ")+1);  //Language
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        /*int num = word2.length();
        System.out.println("num = " + num);

         */

       System.out.println("---------------------------------");


        String words3 = "Python C# ruby";
        String s4 = words3.substring(0, words3.indexOf(" "));
        String s5 = words3.substring(words3.indexOf(" ")+1 , words3.lastIndexOf(" "));
        String s6 = words3.substring(words3.lastIndexOf(" " )+1);
        System.out.println("s4 = " + s4);
        System.out.println("s5 = " + s5);
        System.out.println("s6 = " + s6);






    }
}
