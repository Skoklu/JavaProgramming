package week07;

public class NumberPattern {

    public static void main(String[] args) {
        
        int row = 6;

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {

                //System.out.println(j%2==1? 1  : 0);  OR
                if (j % 2 !=0){
                    System.out.print(1);
                }else {
                    System.out.print(0);
                }
            } System.out.println();


        }
    }
}
