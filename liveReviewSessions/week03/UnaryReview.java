package week03;

public class UnaryReview {

    public static void main(String[] args) {

        int a = 20;
        a++;  //21

        System.out.println("a++ = "+ a++);//20 use the variable then increase by 1
        System.out.println("a = "+ a);   // 21

        int b  = 20;
        System.out.println("++b = "+ ++b);   //21 increase by 1 then use the variable

        int c = 20;
        System.out.println(++c + 1);  //22

        boolean isMarried = false;
        System.out.println("isMarried = " + !isMarried);   //not operator

        int x = 12;

        if (++x >12){
            System.out.println("x in the if statement part : "+ x);
        }else {
            System.out.println("x value in the else statement "+x);
        }

        int y = 12;

        if (y++ > 12){
            System.out.println(" Y in the if statement part : "+ y);
        }
        else {
            System.out.println("y value in the ELSE statement "+ y);
        }


    }
}
