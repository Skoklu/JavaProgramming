package day15_ForLoop;

public class EqualsAndIgnoreEquals {

    public static void main(String[] args) {


        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2));  //false  compare whole words lowerCase and upperCase

        System.out.println(s1.equalsIgnoreCase(s2));  //true ignore the upperCase and LowerCase
    }
}
