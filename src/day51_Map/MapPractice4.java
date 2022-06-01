package day51_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice4 {

    public static void main(String[] args) {

        /*
        String[] group1 = {"Duygu", "Magda", "Farangez", "Edison", "Kerem", "Farangis"};
        String[] group2 = {"Margia", "Vesele", "Iryn", "Nilufar", "Aziza", "Nurcan", "Raika", "Igor", "Elif", "Sana", "Azamet"};
        String[] group9 = {"Alex", "Ali", "Andriy", "Cassandra", "Sevgul", "Olha", "Tito", "Ozan", "Serkan", "Furkan", "Madina", "Muharrem"};
        String[] group24 = {"Maria", "Kristina", "Amin", "George", "Layan", "Amin", "Yulia", "George", "Ayanle", "Maxim", "Nermin", "Doughlas"};
        String[] group5 = {"Nazar", "Veronika", "Mikael", "Layla", "Badmaa", "Zaeir", "Anna", "Tamara", "Eugene"};

         */
        ArrayList<String> group1 = new ArrayList<>(Arrays.asList("Duygu", "Magda", "Farangez", "Edison", "Kerem",
                "Farangis"));
        ArrayList<String> group2 = new ArrayList<>(Arrays.asList("Margia", "Vesele", "Iryn", "Nilufar", "Aziza",
                "Nurcan", "Raika", "Igor", "Elif", "Sana", "Azamet"));
        ArrayList<String> group9 = new ArrayList<>(Arrays.asList("Alex", "Ali", "Andriy", "Cassandra", "Sevgul",
                "Olha", "Tito", "Ozan", "Serkan", "Furkan", "Madina", "Muharrem"));
        ArrayList<String> group24 = new ArrayList<>(Arrays.asList("Maria", "Kristina", "Amin", "George", "Layan",
                "Amin", "Yulia", "George", "Ayanle", "Maxim", "Nermin", "Doughlas"));
        ArrayList<String> group5 = new ArrayList<>(Arrays.asList("Nazar", "Veronika", "Mikael", "Layla", "Badmaa",
                "Zaeir", "Anna", "Tamara", "Eugene"));



        // pair: ID & names of students

        Map<Integer, ArrayList<String>> groups = new TreeMap<>();
        groups.put(1, group1);
        groups.put(2, group2);
        groups.put(9, group9);
        groups.put(24, group24);
        groups.put(5, group5);

        System.out.println(groups);

        System.out.println("-----------------------------------------------------------");

        for (String each : groups.get(2)) {
            System.out.println(each);  //  Margia,Vesele,Iryn,Nilufar,Aziza,Nurcan,Raika,Igor,Elif,Sana,Azamet

        }



        System.out.println(groups.get(2).get(1));  //Vesele

        System.out.println(groups.get(2).get(1).charAt(1));  //e

        System.out.println("---------------------------------------------------------------");


        for (ArrayList<String> eachGroup : groups.values()) {
            for (String eachName : eachGroup) {
                System.out.println(eachName);

            }

        }


    }


}
