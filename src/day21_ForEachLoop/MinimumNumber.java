package day21_ForEachLoop;

public class MinimumNumber {

    public static void main(String[] args) {


        int [] numbers ={60, 70, 40, 10, 30, 90, 50};
        int min = 0;

        for (int each : numbers) {

            if (each <min){
                min = each;
            }

        }
        System.out.println(min);
    }
}
