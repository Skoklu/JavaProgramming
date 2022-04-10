package week03;

public class Grader {

    public static void main(String[] args) {

      /*for a given assign Letter Grades : 100-90 (inclusive) A
      89 -80 = B
      79-70 = C
      69-60 = D
      below is F
       */

        int num = 78;

        if (num <= 100 && num >= 90) {
            System.out.println("A");

        } else if (num <90 && num >= 80) {
            System.out.println("B");

        } else if (num <80 && num >= 70) {
            System.out.println("C");
        }
        else if (num <70 && num >= 60) {
            System.out.println("D");
        }
        else{
            System.out.println("fail");
    }
    }
}

