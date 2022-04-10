package day15_ForLoop;

public class ForLoopsPractice2 {

    public static void main(String[] args) {


        for (char i ='A'; i <='Z'; i++){
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.println("-----------------OR----------------");

        for (int i = 65; i <= 95; i++){
            System.out.print((char) i + " ");
        }
        System.out.println();
        System.out.println("---------------------------------------------");


        for (char i = 'a'; i <= 'z' ; i++){

            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println("------------------------------------");

        for (char i = 'Z'; i >= 'A'; i--){

            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-----------------------");

        for (char i = 'z'; i >= 'a'; i--){

            System.out.print(i + " ");
        }

    }
}
/*
Print:
A ~ Z
a ~ z
Z ~ A
z ~ a
 */