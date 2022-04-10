package day03_EscapeSequances;

/*
escape sequance:must be given with double qoute
\n: starts a new line
\t: tab like paragraph starting (space)
\\: single backward slash
\": double qoute

 */

public class EscapeSequences {
    public static void main(String[] args) {

       System.out.println("Java \nPython \nC#");

        System.out.println("---------------------------");

        System.out.println("Hello Cydeo \nHow are you all today? \nit's nice to see you all! \nWhat class do we have next week?");

        System.out.println("----------------------------");

        System.out.println("\tJava is cool programming Language");

        System.out.println("/\\\\");  //in order to print one backward slash we need to give two backward slashes

        System.out.println("My Favorite TV show is \"Game of Thrones\""); // in order to print double qoute (") we need to use \" (backward slash and double qoute)


    }




}
