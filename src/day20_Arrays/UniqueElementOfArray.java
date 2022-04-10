package day20_Arrays;

public class UniqueElementOfArray {

    public static void main(String[] args) {


        String [] str = {"Java", "Java", "Java", "Java", "C#", "Python", "Python", "Python"};

        for (int i = 0; i < str.length; i++) {

            String element = str[i];
            int frequency = 0;
            for (int j = 0; j < str.length; j++) {   //finds the frequency of element from array
                if (str[j].equals(element)){
                    frequency++;
                }

            }
            if (frequency ==1){
                System.out.println( element);
            }
        }
    }
}
