package day21_ForEachLoop;

public class UniqueElements {

    public static void main(String[] args) {


        String[] name = {"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"};


        for (String each : name) {
            int count = 0;
            for (String element : name) {
                if (element.equals(each)) {
                    count++;
            }
        }

            if (count == 1) {
                System.out.println(each);
            }
            }
    }
}
