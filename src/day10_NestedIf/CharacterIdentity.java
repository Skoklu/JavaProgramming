package day10_NestedIf;

public class CharacterIdentity {

    public static void main(String[] args) {

        char ch = '@';

//{} curly braces are not necessary after if statement

        if ( ch >= '0' && ch <= '9'){
            System.out.println( "Digit");
        }
        else if (ch >= 'A' && ch <= 'Z'){
            System.out.println("Alphabet");
        }
        else {
            System.out.println("Special Character");
        }
    }
}
