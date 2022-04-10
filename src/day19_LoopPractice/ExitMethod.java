package day19_LoopPractice;

public class ExitMethod {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            if (i ==3){  //0, 1, 2 will be printed
               // break;  //terminate the loop
                //continue;   //terminates the current iteration of the loop
                System.exit(0); //terminate  the whole program
            }
            System.out.println(i);
        }
        System.out.println("Wooden Spoon");
    }
}
