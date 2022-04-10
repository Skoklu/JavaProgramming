package day15_ForLoop;

public class StringContains {

    public static void main(String[] args) {

        String  sentence = "My favoite programming language is Java";

        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.contains("java");
        boolean hasJava3 = sentence.toLowerCase().contains("java");
        boolean r = sentence.contains("java")||sentence.contains("Java");


        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);
        System.out.println(r);

        System.out.println("--------------------------------------------");
        String input1 = "I love JAvA";
        String input2 = "Java";

        System.out.println(input1.equals(input2));  //false
        System.out.println(input1.equalsIgnoreCase(input2));  //false

        System.out.println(input1.contains("Java"));   //true
        System.out.println(input1.contains("Java") && input2.contains("Java"));  //false

        System.out.println(input1.toLowerCase().contains("java"));//True like equalIgnoreCase
        System.out.println(input1.toUpperCase().contains("JAVA"));  // True like equalIgnoreCase

        System.out.println("-----------------------------------");

    }
}
