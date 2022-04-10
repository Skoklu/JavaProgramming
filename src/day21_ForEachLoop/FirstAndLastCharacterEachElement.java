package day21_ForEachLoop;

public class FirstAndLastCharacterEachElement {

    public static void main(String[] args) {

        String [] str = {"Java Programming","Cydeo School", "Wooden Spoon", "Early Bird", "Angry Bird"};

        for (String each : str) {
            System.out.println(each.charAt(0) + ""+ each.charAt(each.length()-1));

        }
    }
}
