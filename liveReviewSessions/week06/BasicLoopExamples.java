package week06;

public class BasicLoopExamples {

    public static void main(String[] args) {

//0, 10, 20, 30, ......1000
        //int i = 0: initialization
        //i<= 1000: condition
        //i+=: iteration
        for (int i = 0; i <=1000 ; i+=10) {
            System.out.print(i+ " ");
        }
        System.out.println("-------------------------------------");

        int z =0;
        for (; z <= 1000 ; ) {
            if (z % 10 == 0){
                System.out.print(z + " ");
        }
            z++;
        }
        System.out.println(z);

        System.out.println("------------------------------------------------");

        for (int i = 3; i <130 ; i+=2) {
            System.out.print(i + " ");

        }

        System.out.println("----------------------------------");

        int evenNum = 0;
        for (int i = 5; i <+50 ; i++) {

            if (evenNum % 2 ==0){
                ++evenNum;
            }


        }
        System.out.print("evenNum = " + evenNum);
        System.out.println("-------------------------------------------");
 /*
 Question-4:
         Print the table of 12 using for loop.
         Output should be in following format:
         12 X 1 = 12
         12 X 2 = 24
         12 X 3 = 36
         12 X 4 = 48
         12 X 5 = 60
         12 X 6 = 72
         12 X 7 = 84
         12 X 8 = 96
         12 X 9 = 108
         12 X 10 = 120
  */

        for (int j = 0; j <=10 ; j++) {
            System.out.println("12 X "+ "=" + (12 *j));
        }
        System.out.println("------------------------------------------");


        // Print all the letters from A to Z
        // char A in the ASCII table is 65 , and Z is 90
// how can I turn integer into char : explicit casting
        for (int i = 65; i <=90 ; i++) {
            System.out.print((char)i+" ");
        }
        System.out.println("");

        for (char c = 'A'; c<='Z';c++) {
            System.out.print(c+" ");

        }



    }
}
