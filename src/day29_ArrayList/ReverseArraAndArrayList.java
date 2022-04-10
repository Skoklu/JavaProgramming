package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArraAndArrayList {

    public static void main(String[] args) {

        System.out.println("--------------------------Array-----------------");
        int [] array = {1,2,3,4,5,6};

        int j =0;
        int []result = new int[array.length];

        for (int i = array.length - 1; i >= 0; i--,j++) {

           result[j] =  array[i];


        }
        System.out.println(Arrays.toString(result));

        System.out.println("---------------------------ArrayList--------------------------------");

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        ArrayList<Integer> reversedList = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {

            int each = list.get(i);
            reversedList.add(each);

        }
        System.out.println("reversedList = " + reversedList);
    }
}
